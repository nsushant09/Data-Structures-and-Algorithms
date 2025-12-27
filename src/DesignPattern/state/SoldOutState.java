package designpatterns.state;

public class SoldOutState extends GumballState {

    GumballMachine gumballMachine;

    SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.count > 0) {
            gumballMachine.setGumballState(gumballMachine.noQuarterState);
        } else {
            gumballMachine.setGumballState(gumballMachine.soldOutState);
        }
    }
}
