package io.quarkiverse.githubaction.runtime;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import org.jboss.logging.Logger;
import io.quarkiverse.githubaction.Commands;
import io.quarkiverse.githubaction.runtime.github.EnvFiles;

/**
 * See https://docs.github.com/en/actions/learn-github-actions/workflow-commands-for-github-actions
 */
public class CommandsImpl implements Commands {

    private static final Logger LOG = Logger.getLogger(CommandsImpl.class);

    private Map<String, String> env;

    private String currentStopCommandsMarker;

    public CommandsImpl(Map<String, String> env) {
        this.env = env;
    }

    @Override
    public void setOutput(String name, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void debug(String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void notice(String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void notice(String message, String title, String file, Integer line, Integer endLine, Integer col, Integer endColumn) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void warning(String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void warning(String message, String title, String file, Integer line, Integer endLine, Integer col, Integer endColumn) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void error(String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void error(String message, String title, String file, Integer line, Integer endLine, Integer col, Integer endColumn) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void group(String title) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void echo(String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void endGroup() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void addMask(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void stopCommands() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void pursueCommands() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void echoOn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void echoOff() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void saveState(String name, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void environmentVariable(String name, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void jobSummary(String markdownContent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void appendJobSummary(String markdownContent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void removeJobSummary() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void systemPath(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void message(String level, String message, String title, String file, Integer line, Integer endLine, Integer col, Integer endColumn) {
        StringBuilder command = new StringBuilder();
        command.append("::" + level);
        Map<String, String> parameters = new LinkedHashMap<>();
        if (file != null && !file.isBlank()) {
            parameters.put("file", file);
        }
        if (line != null) {
            parameters.put("line", String.valueOf(line));
        }
        if (endLine != null) {
            parameters.put("endLine", String.valueOf(endLine));
        }
        if (col != null) {
            parameters.put("col", String.valueOf(col));
        }
        if (endColumn != null) {
            parameters.put("endColumn", String.valueOf(endColumn));
        }
        if (title != null && !title.isBlank()) {
            parameters.put("title", title);
        }
        command.append(parameters.keySet().stream().map(key -> key + "=" + parameters.get(key)).collect(Collectors.joining(",", " ", "")));
        command.append("::");
        command.append(message);
        command(command.toString());
    }

    private void command(String command) {
        System.out.println(command);
    }

    private void appendEnvFile(String fileName, String name, String value) {
        appendEnvFile(fileName, formatEnvNameValue(name, value));
    }

    private void appendEnvFile(String fileName, String content) {
        writeEnvFile(fileName, content, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    private void writeEnvFile(String fileName, String content, OpenOption... openOptions) {
        Path path = getEnvFilePath(fileName);
        try {
            Files.writeString(path, content + "\n", openOptions);
            LOG.debugf("Wrote %s in environment file %s", content, path);
        } catch (IOException e) {
            throw new UncheckedIOException("Unable to write content to file " + fileName + " at path " + path, e);
        }
    }

    private Path getEnvFilePath(String fileName) {
        String envFileName = env.get(fileName);
        if (envFileName == null || envFileName.isBlank()) {
            throw new IllegalStateException("No path defined for environment file " + fileName);
        }
        Path path = Paths.get(envFileName);
        return path;
    }

    private static String formatEnvNameValue(String name, String value) {
        if (value.contains("\n")) {
            return name + "<<EOF\n" + value + "\nEOF";
        }
        return name + "=" + value;
    }
}
