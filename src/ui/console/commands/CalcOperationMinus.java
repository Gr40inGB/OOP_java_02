package ui.console.commands;

import ui.View;

public class CalcOperationMinus extends Command{
    @Override
    public String getDescription() {
        return " - ";
    }

    @Override
    public void run() {
        getView().getPresenter().minus();
    }

    public CalcOperationMinus(View view) {
        super(view);
    }
}
