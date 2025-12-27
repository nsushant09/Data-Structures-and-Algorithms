package designpatterns.adapter;

import designpatterns.strategy.Duck.Duck;
import designpatterns.strategy.Duck.FlyBehaviour;
import designpatterns.strategy.Duck.QuackBehaviour;

public class TurkeyAdapter extends Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey, FlyBehaviour flyBehave, QuackBehaviour quackBehave) {
        this.turkey = turkey;
        flyBehaviour = flyBehave;
        quackBehaviour = quackBehave;
    }

    @Override
    protected void display() {
        System.out.println("Displaying adapted" + turkey);
    }
}
