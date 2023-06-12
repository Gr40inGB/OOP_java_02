package ui.console.commands;

import ui.View;

public class EnterNumber extends Command{
    public EnterNumber(View view) {
        super(view);
    }

    @Override
    public String getDescription() {
        return "Input number";
    }

    @Override
    public void run() {

    }
}
