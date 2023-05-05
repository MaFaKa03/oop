package oop.homework2;

public class CaseOperation extends Calculator {
    public CaseOperation(double firstNum, double secondNum, String oper){
        super(firstNum, secondNum, oper);
    }

    public String operation(String oper){
        switch (oper){
            case "+":
                return getFirstNum() + " + " + getSecondNum() + " = " + sum();
            case "-":
                return getFirstNum() + " - " + getSecondNum() + " = " + sub();
            case "*":
                return getFirstNum() + " * " + getSecondNum() + " = " + mult();
            case "/":
                return getFirstNum() + " / " + getSecondNum() + " = " + div();
            default:
                return "Try another operation, please!";
        }
    }
}
