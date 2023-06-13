package ui.console.commands;

import ui.View;

public class EnterRightNumber extends Command{
    public EnterRightNumber(View view) {
        super(view);
    }

    @Override
    public String getDescription() {
        return "Input right number";
    }

    @Override
    public void run() {
        getView().getPresenter().enterRight();
    }
}
