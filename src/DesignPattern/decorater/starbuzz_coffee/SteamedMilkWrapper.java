package designpatterns.decorater.starbuzz_coffee;

public class SteamedMilkWrapper extends BeverageWrapper {

    Beverage wrappingBeverage;

    SteamedMilkWrapper(Beverage wrappingObject) {
        wrappingBeverage = wrappingObject;
        description = "Steamed milk added, " + wrappingBeverage.getDescription();
        setSize(wrappingBeverage.getSize());
        prices = getPrices(3, 4, 5);
    }

    @Override
    int cost() {
        return prices.get(wrappingBeverage.getSize()) + wrappingBeverage.cost();
    }
}
