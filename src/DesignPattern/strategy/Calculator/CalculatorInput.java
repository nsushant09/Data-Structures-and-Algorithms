package designpatterns.strategy.Calculator;


import java.util.Scanner;

public class CalculatorInput {
    static Scanner sc = new Scanner(System.in);

    private CalculatorInput(){}
    int inputValue(String inputMessage) {
        System.out.print(inputMessage + " : ");
        return sc.nextInt();
    }

    String inputOperation() {
        System.out.print("Enter your desired operation (+, -, *, /) : ");
        return sc.next();
    }

    static CalculatorInput instance = null;

    static CalculatorInput getInstance() {
        if (instance == null) {
            instance = new CalculatorInput();
        }
        return instance;
    }
}
