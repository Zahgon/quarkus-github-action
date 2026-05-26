package org.acme;

import io.quarkiverse.githubaction.Action;
import io.quarkiverse.githubaction.Commands;

public class MyAction {

    @Action
    void action(Commands commands) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
