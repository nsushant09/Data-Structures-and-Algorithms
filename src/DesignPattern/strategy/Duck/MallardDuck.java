package designpatterns.strategy.Duck;

public class MallardDuck extends Duck {

    MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    protected void display() {
        System.out.println("Displaying Mallard designpatterns.strategy.Duck");
    }
}
