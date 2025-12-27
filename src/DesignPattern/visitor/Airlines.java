package designpatterns.visitor;

public class Airlines extends Client{
    public Airlines(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitAirlines(this);
    }
}
