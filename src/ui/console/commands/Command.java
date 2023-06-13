package ui.console.commands;

import ui.View;

public abstract class Command implements CommandService {
    View view;

    public Command(View view) {
        this.view = view;
    }

    public View getView() {
        return view;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
