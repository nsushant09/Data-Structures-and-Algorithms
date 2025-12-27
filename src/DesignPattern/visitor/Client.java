package designpatterns.visitor;

public abstract class Client {
    protected int id;
    protected String name;
    protected String address;
    abstract void accept(Visitor visitor);
}

