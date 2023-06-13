package ui.console.commands;

import ui.View;

public class CalcOperationDeside extends Command{
    @Override
    public String getDescription() {
        return " / ";
    }

    @Override
    public void run() {
        getView().getPresenter().deside();
    }

    public CalcOperationDeside(View view) {
        super(view);
    }
}
