package designpatterns.decorater.starbuzz_coffee;

import java.util.HashMap;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    protected enum Size {TALL, GRANDE, VENTI}

    ;
    private Size size = Size.TALL;

    HashMap<Size, Integer> prices = new HashMap<>();

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    int cost() {
        return prices.get(size);
    }

    protected HashMap<Size, Integer> getPrices(int tallPrice, int grandePrice, int ventiPrice) {
        HashMap<Size, Integer> temp = new HashMap<>();
        temp.put(Size.TALL, tallPrice);
        temp.put(Size.GRANDE, grandePrice);
        temp.put(Size.VENTI, ventiPrice);
        return temp;
    }


}

