package ui.console.commands;

import ui.View;

public class CalcOperationPlus extends Command{
    @Override
    public String getDescription() {
        return " + ";
    }

    @Override
    public void run() {
        getView().getPresenter().plus();
    }

    public CalcOperationPlus(View view) {
        super(view);
    }
}
