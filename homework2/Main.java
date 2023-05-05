package oop.homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNum = scan.nextDouble();
        System.out.println("Enter second number: ");
        double secondNum = scan.nextDouble();
        System.out.println("Enter desired operation: ");
        String symb = scan.next();

        CaseOperation oper = new CaseOperation(firstNum, secondNum, symb);

        System.out.println(oper.operation(symb));

    }
}
