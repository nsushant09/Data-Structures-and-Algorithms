package designpatterns.decorater.starbuzz_coffee;

public class HouseBlend extends Beverage {

    HouseBlend() {
        description = "Missing your homemade coffee?? Try this home blend";
        prices = getPrices(40, 42, 44);
    }
}
