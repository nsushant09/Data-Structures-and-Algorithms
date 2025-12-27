package designpatterns.strategy.Duck;

import designpatterns.adapter.Turkey;
import designpatterns.adapter.TurkeyAdapter;
import designpatterns.adapter.WildTurkey;

import java.util.ArrayList;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.performFly();
        duck.setFlyBehaviour(new FlyRocketPowered());
        duck.performFly();
        duck.performQuack();

        Turkey wildTurkey = new WildTurkey();
        Duck wildTurkeyAdapted = new TurkeyAdapter(wildTurkey, new FlyShortDistance(), new GobbleQuack());
        wildTurkeyAdapted.performFly();
        wildTurkeyAdapted.performQuack();
    }
}
