package designpatterns.state;

public class GumballMachine {


    GumballState soldState;
    GumballState soldOutState;
    GumballState noQuarterState;
    GumballState hasQuarterState;

    GumballState gumballState;
    int count = 0;

    GumballMachine(int gumballCount) {
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);

        this.count = gumballCount;

        if (this.count > 0) {
            gumballState = noQuarterState;
        } else {
            gumballState = soldOutState;
        }

    }

    void insertQuarter() {
        gumballState.insertQuarter();
    }

    void ejectQuarter() {
        gumballState.ejectQuarter();
    }

    void turnCrank() {
        gumballState.turnCrank();
    }

    void dispense() {
        gumballState.dispense();
    }

    void setGumballState(GumballState gumballState) {
        this.gumballState = gumballState;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
        }
    }

}
