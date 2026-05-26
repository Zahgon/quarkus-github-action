package io.quarkiverse.githubaction.runtime;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import org.kohsuke.github.GHEventPayload;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import io.quarkiverse.githubaction.Commands;
import io.quarkiverse.githubaction.Context;
import io.quarkiverse.githubaction.Inputs;
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClient;
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClientBuilder;

@SuppressWarnings("unused")
public class GitHubEvent {

    private static final String AUTHORIZATION_HEADER = "Authorization";

    private static final String AUTHORIZATION_HEADER_BEARER = "Bearer %s";

    private final String name;

    private final Context context;

    private final String eventAction;

    private final Inputs inputs;

    private final Commands commands;

    private final Class<? extends GHEventPayload> payloadType;

    private volatile GHEventPayload payload;

    private volatile GitHub gitHubClient;

    private volatile DynamicGraphQLClient gitHubGraphQLClient;

    private volatile GHRepository gitHubRepository;

    GitHubEvent(String name, Context context, String eventAction, Inputs inputs, Commands commands, Class<? extends GHEventPayload> payloadType) {
        this.name = name;
        this.context = context;
        this.eventAction = eventAction;
        this.inputs = inputs;
        this.commands = commands;
        this.payloadType = payloadType;
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getEvent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getEventAction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Context getContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Inputs getInputs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Commands getCommands() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public GHEventPayload getPayload() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public GitHub getGitHub() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DynamicGraphQLClient getDynamicGraphQLClient() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public GHRepository getGHRepository() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static GHRepository createGHRepository(GitHub gitHub, String repositoryName) {
        if (gitHub.isOffline()) {
            throw new IllegalStateException("The GitHub REST client is offline, unable to inject the repository '%s'".formatted(repositoryName));
        }
        try {
            return gitHub.getRepository(repositoryName);
        } catch (IOException ex) {
            throw new IllegalStateException("Unable to access repository '%s'".formatted(repositoryName), ex);
        }
    }
}
