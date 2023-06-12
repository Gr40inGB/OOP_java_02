package presenter;

import model.CalculatorService;
import model.Service;
import ui.console.ConsoleView;
import ui.View;

public class Presenter {
    View view;
    Service service;

    public Presenter() {
        this.view = new ConsoleView(this);
        this.service = new CalculatorService();
    }
}
