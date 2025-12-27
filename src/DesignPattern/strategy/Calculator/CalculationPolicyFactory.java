package designpatterns.strategy.Calculator;

public class CalculationPolicyFactory {
    static CalculationPolicy getInstance(String calculationType) {
        return switch (calculationType) {
            case "+" -> new AdditionPolicy();
            case "-" -> new SubtractionPolicy();
            case "*" -> new MultiplicationPolicy();
            default -> new DivisionPolicy();

        };
    }
}
