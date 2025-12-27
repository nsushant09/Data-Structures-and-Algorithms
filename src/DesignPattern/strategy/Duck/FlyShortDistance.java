package designpatterns.strategy.Duck;

public class FlyShortDistance implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I'm flying short distance");
    }
}
