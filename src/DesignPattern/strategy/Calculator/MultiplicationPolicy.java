package designpatterns.strategy.Calculator;

public class MultiplicationPolicy implements CalculationPolicy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
