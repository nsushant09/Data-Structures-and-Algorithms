package designpatterns.strategy.Duck;

public class GobbleQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Gobble Gobble");
    }
}
