package ui.console.commands;

import ui.View;
import ui.console.ConsoleView;

public class Exit extends Command{
    public Exit(View view) {
        super(view);
    }

    @Override
    public String getDescription() {
        return "Exit";
    }

    @Override
    public void run() {
        getView().exit();
    }
}
