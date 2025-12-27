package designpatterns.visitor;

public class Hotel extends Client {
    public Hotel(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitHotel(this);
    }
}
