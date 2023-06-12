package ui.console;

import presenter.Presenter;
import ui.Menu;
import ui.View;

import java.util.Scanner;

public class ConsoleView implements View {

    private Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    boolean runUI;

    public ConsoleView(Presenter presenter) {
        this.scanner = new Scanner(System.in);
        this.presenter = presenter;
        this.menu = new Menu("Main menu",this);


        this.runUI = true;
    }

    @Override
    public void start() {
        while (this.runUI){
            System.out.println();
        }
    }

    @Override
    public Presenter getPresenter() {
        return this.presenter;
    }

    @Override
    public void showMenu() {

    }
}
