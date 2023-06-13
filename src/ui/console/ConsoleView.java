package ui.console;

import presenter.Presenter;
import ui.Menu;
import ui.View;
import ui.console.commands.*;

import java.util.Scanner;

public class ConsoleView implements View {

    private Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    boolean runUI;

    public boolean isRunUI() {
        return runUI;
    }

    public void setRunUI(boolean runUI) {
        this.runUI = runUI;
    }

    public ConsoleView(Presenter presenter) {
        this.scanner = new Scanner(System.in);
        this.presenter = presenter;
        this.menu = new Menu("Main menu", this);
        this.menu.add(new EnterLeftNumber(this));
        this.menu.add(new EnterRightNumber(this));
        this.menu.add(new CalcOperationPlus(this));
        this.menu.add(new CalcOperationMinus(this));
        this.menu.add(new CalcOperationMulty(this));
        this.menu.add(new CalcOperationDeside(this));
        this.menu.add(new Exit(this));
        this.runUI = true;
    }

    @Override
    public void start() {
        while (this.runUI) {
            System.out.println(menu.showMenu());
            menu.run(inputNumber("",menu.getMenuSize()));
        }
    }

    @Override
    public void exit() {
        this.runUI = false;
    }

    @Override
    public Presenter getPresenter() {
        return this.presenter;
    }


    @Override
    public void showRezult(String rezult) {
        System.out.print("Rezult: " + rezult + "\n");
    }

    private int inputNumber(String welcome, int biggest) {
        boolean inputError = true;
        int rezult = 0;
        while (inputError) {
            System.out.print(welcome);
            try {
                rezult = Integer.parseInt(scanner.nextLine());
                if (rezult <= biggest && rezult > 0) {
                    inputError = false;
                } else System.out.print("Choose between 1-" + biggest + "\n>>>> ");
            } catch (NumberFormatException nfe) {
                System.out.println("error - try again:");
            }
        }
        return rezult;
    }
}
