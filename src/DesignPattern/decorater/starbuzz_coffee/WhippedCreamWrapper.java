package designpatterns.decorater.starbuzz_coffee;

public class WhippedCreamWrapper extends BeverageWrapper {
    Beverage wrappingBeverage;

    WhippedCreamWrapper(Beverage wrappingObject) {
        wrappingBeverage = wrappingObject;
        description = "Whipped Cream added, " + wrappingBeverage.getDescription();
        setSize(wrappingBeverage.getSize());
        prices = getPrices(4, 5, 6);
    }

    @Override
    int cost() {
        return prices.get(wrappingBeverage.getSize()) + wrappingBeverage.cost();
    }
}
