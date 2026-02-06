package org.ln.fx.directorytool.action;

import org.ln.fx.directorytool.DirectoryToolController;

public class ExecuteEmptyCancelCommand implements Runnable {

    private final DirectoryToolController controller;

    public ExecuteEmptyCancelCommand(DirectoryToolController controller) {
        this.controller = controller;
    }

    @Override
    public void run() {
        controller.processDirectory();
    }
}
