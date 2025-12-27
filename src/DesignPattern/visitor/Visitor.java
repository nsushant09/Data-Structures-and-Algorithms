package designpatterns.visitor;

public interface Visitor {
    void visitAirlines(Airlines airlines);
    void visitHotel(Hotel hotel);
}
