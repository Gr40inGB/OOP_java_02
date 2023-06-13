package ui.console.commands;

import ui.View;

public class EnterLeftNumber extends Command{
    public EnterLeftNumber(View view) {
        super(view);
    }

    @Override
    public String getDescription() {
        return "Input left number";
    }

    @Override
    public void run() {
        getView().getPresenter().enterLeft();
    }
}
