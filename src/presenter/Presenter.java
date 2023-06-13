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
        this.service = new CalculatorService(this);
    }

    public View getView() {
        return view;
    }

    public Service getService() {
        return service;
    }

    public void enterLeft() {
        getService().setLeftNumber();
    }

    public void enterRight() {
        getService().setRightNumber();
    }

    public void deside() {
        view.showRezult(service.deside());
    }

    public void multy() {
        view.showRezult(service.multy());
    }

    public void minus() {
        view.showRezult(service.minus());
    }

    public void plus() {
        view.showRezult(service.plus());
    }
}
