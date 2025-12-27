package designpatterns.decorater.starbuzz_coffee;

public class DarkRoast extends Beverage {

    DarkRoast() {
        description = "This is the best dark roast in town";
        prices = getPrices(10, 12, 14);
    }

}
