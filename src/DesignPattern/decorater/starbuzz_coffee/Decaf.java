package designpatterns.decorater.starbuzz_coffee;

public class Decaf extends Beverage {

    Decaf() {
        description = "decaf your day";
        prices = getPrices(20, 22, 24);
    }
}
