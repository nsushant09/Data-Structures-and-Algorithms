package designpatterns.state;

public abstract class GumballState {

    void insertQuarter() {
        throw new UnsupportedOperationException();
    }

    void ejectQuarter() {
        throw new UnsupportedOperationException();
    }

    void turnCrank() {
        throw new UnsupportedOperationException();
    }

    void dispense() {
        throw new UnsupportedOperationException();
    }
}
