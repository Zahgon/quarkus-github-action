package io.quarkiverse.githubaction.runtime;

import jakarta.inject.Singleton;
import io.quarkiverse.githubaction.Commands;
import io.quarkiverse.githubaction.CommandsInitializer;

@Singleton
public class CommandsInitializerImpl implements CommandsInitializer {

    @Override
    public Commands createCommands() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
