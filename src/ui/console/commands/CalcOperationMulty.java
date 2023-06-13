package ui.console.commands;

import ui.View;

public class CalcOperationMulty extends Command{
    @Override
    public String getDescription() {
        return " * ";
    }

    @Override
    public void run() {
        getView().getPresenter().multy();
    }

    public CalcOperationMulty(View view) {
        super(view);
    }
}
