package designpatterns.strategy.Calculator;

public class Calculator {
    private CalculationPolicy calculationPolicy;

    int calculate(int a, int b) {
        return calculationPolicy.calculate(a, b);
    }

    public void setCalculationPolicy(CalculationPolicy calculationPolicy) {
        this.calculationPolicy = calculationPolicy;
    }
}
