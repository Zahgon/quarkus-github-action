package io.quarkiverse.githubaction;

import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;

/**
 * Inputs provided to the action.
 */
public interface Inputs {

    String ACTION = "action";

    String GITHUB_TOKEN = "github-token";

    Map<String, String> all();

    default Optional<String> get(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default String getRequired(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Optional<Boolean> getBoolean(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default boolean getRequiredBoolean(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default OptionalLong getLong(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default long getRequiredLong(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Deprecated(forRemoval = true)
    default OptionalInt getInteger(String key) {
        return getInt(key);
    }

    default OptionalInt getInt(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default int getRequiredInt(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default String getAction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default Optional<String> getGitHubToken() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
