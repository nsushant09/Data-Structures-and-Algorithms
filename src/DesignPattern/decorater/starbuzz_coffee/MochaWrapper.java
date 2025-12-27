package designpatterns.decorater.starbuzz_coffee;

public class MochaWrapper extends BeverageWrapper {

    Beverage wrappingBeverage;

    MochaWrapper(Beverage wrappingObject) {
        wrappingBeverage = wrappingObject;
        description = "Mocha added, " + wrappingBeverage.getDescription();
        setSize(wrappingBeverage.getSize());
        prices = getPrices(1, 2, 3);

    }

    @Override
    int cost() {
        return prices.get(wrappingBeverage.getSize()) + wrappingBeverage.cost();
    }
}
