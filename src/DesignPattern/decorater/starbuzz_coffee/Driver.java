package designpatterns.decorater.starbuzz_coffee;

public class Driver {
    public static void main(String[] args) {
        Beverage main = new HouseBlend();
        main.setSize(Beverage.Size.GRANDE);
        Beverage order = new WhippedCreamWrapper(new MochaWrapper(new MochaWrapper(new SoyWrapper(main))));
        System.out.println();
        System.out.println(order.description);
        System.out.println(order.cost());
    }
}
