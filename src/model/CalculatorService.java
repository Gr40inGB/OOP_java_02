package model;

import presenter.Presenter;

import java.util.Scanner;

public class CalculatorService implements Service {


    Calculator calculator;
    String error = "Please input Numbers first\n";

    public CalculatorService(Presenter presenter) {
        this.calculator = new Calculator();
        this.presenter = presenter;
    }


    Presenter presenter;

    @Override
    public String deside() {
        if (this.calculator.leftRightNotNull()) {

            return calculator.getResult("/").toString();
        }
        return error;
    }

    @Override
    public String multy() {

        if (this.calculator.leftRightNotNull()) {

            return calculator.getResult("*").toString();
        }
        return error;
    }

    @Override
    public String minus() {

        if (this.calculator.leftRightNotNull()) {
            return calculator.getResult("-").toString();
        }

        return error;
    }

    @Override
    public String plus() {
        if (this.calculator.leftRightNotNull()) {
            return calculator.getResult("+").toString();
        }
        return error;
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setLeftNumber() {
        this.calculator.setLeftNumber(inputNumber("Please enter left number: "));
    }

    @Override
    public void setRightNumber() {
        this.calculator.setRightNumber(inputNumber("Please enter right number: "));
    }

    public Double inputNumber(String welcome) {
        Scanner scan = new Scanner(System.in);
        boolean inputError = true;
        Double rezult = 0.0;
        while (inputError) {
            System.out.print(welcome);
            try {
                rezult = Double.parseDouble(scan.nextLine());
                inputError = false;
            } catch (NumberFormatException nfe) {
                System.out.println("error - try again:");
            }
        }
        return rezult;
    }
}
