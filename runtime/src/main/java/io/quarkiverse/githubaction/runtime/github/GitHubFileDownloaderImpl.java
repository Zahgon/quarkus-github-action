package io.quarkiverse.githubaction.runtime.github;

import java.io.IOException;
import java.util.Optional;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.jboss.logging.Logger;
import org.kohsuke.github.GHContent;
import org.kohsuke.github.GHFileNotFoundException;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import io.quarkiverse.githubaction.GitHubFileDownloader;
import io.quarkus.runtime.LaunchMode;

@Singleton
public class GitHubFileDownloaderImpl implements GitHubFileDownloader {

    private static final Logger LOG = Logger.getLogger(GitHubFileDownloaderImpl.class);

    @Inject
    LaunchMode launchMode;

    @SuppressWarnings("deprecation")
    @Override
    public Optional<String> getFileContent(GitHub gitHub, String repository, String fullPath) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
