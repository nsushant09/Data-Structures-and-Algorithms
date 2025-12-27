package designpatterns.strategy.Calculator;

public class AdditionPolicy implements CalculationPolicy {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
