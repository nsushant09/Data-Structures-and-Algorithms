package designpatterns.strategy.Duck;

public class DecoyDuck extends Duck {

    DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    protected void display() {
        System.out.println("Displaying Decoy designpatterns.strategy.Duck");
    }
}
