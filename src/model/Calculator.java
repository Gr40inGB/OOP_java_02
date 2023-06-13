package model;

public class Calculator {
    private Double leftNumber;
    private Double rightNumber;

    public Double getResult(String operation) {
        return switch (operation) {
            case "+" -> plus(this.leftNumber, this.rightNumber);
            case "-" -> minus(this.leftNumber, this.rightNumber);
            case "*" -> multiply(this.leftNumber, this.rightNumber);
            case "/" -> divide(this.leftNumber, this.rightNumber);

            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }

    public boolean leftRightNotNull(){
        return this.leftNumber != null && this.rightNumber != null;
    }

    public void setLeftNumber(Double leftNumber) {
        this.leftNumber = leftNumber;
    }

    public void setRightNumber(Double rightNumber) {
        this.rightNumber = rightNumber;
    }

    private Double divide(Double left, Double right) {

        return left / right;
    }

    private Double multiply(Double left, Double right) {
        return left * right;
    }

    private Double minus(Double left, Double right) {
        return left - right;
    }

    private Double plus(Double left, Double right) {
        return left + right;
    }
}
