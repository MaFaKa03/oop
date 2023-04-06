package oop.homework2;

public class Calculator implements Operation {
    private double firstNum;
    private double secondNum;
    private  String operation;
    public Calculator(double firstNum, double secondNum, String oper){
        this.secondNum = secondNum;
        this.firstNum = firstNum;
        this.operation = oper;
    }

    public double getFirstNum() {
        return firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public String getOperation() {
        return operation;
    }

    @Override
    public double sum() {
        return firstNum + secondNum;
    }

    @Override
    public double sub() {
        return firstNum - secondNum;
    }

    @Override
    public double mult() {
        return firstNum * secondNum;
    }

    @Override
    public double div() {
        return firstNum / secondNum;
    }
}
