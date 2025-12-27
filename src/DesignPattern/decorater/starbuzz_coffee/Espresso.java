package designpatterns.decorater.starbuzz_coffee;

public class Espresso extends Beverage {

    Espresso() {
        description = "Start your day in espresso way";
        prices = getPrices(30, 32, 34);
    }

}
