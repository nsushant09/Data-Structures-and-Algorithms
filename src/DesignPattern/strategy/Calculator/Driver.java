package designpatterns.strategy.Calculator;

public class Driver {
    public static void main(String[] args) {

        CalculatorInput calculatorInput = CalculatorInput.getInstance();
        int firstInput = calculatorInput.inputValue("Enter first number");
        int secondInput = calculatorInput.inputValue("Enter second number");
        String operation = calculatorInput.inputOperation();

        Calculator calculator = new Calculator();
        calculator.setCalculationPolicy(CalculationPolicyFactory.getInstance(operation));
        int output = calculator.calculate(firstInput, secondInput);
        System.out.println(output);
    }
}
