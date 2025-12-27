package designpatterns.decorater.starbuzz_coffee;

public class SoyWrapper extends BeverageWrapper {

    Beverage wrappingBeverage;

    SoyWrapper(Beverage wrappingObject) {
        wrappingBeverage = wrappingObject;
        description = "Soy added, " + wrappingBeverage.getDescription();
        setSize(wrappingBeverage.getSize());
        prices = getPrices(2, 3, 4);
    }

    @Override
    int cost() {
        return prices.get(wrappingBeverage.getSize()) + wrappingBeverage.cost();
    }
}
