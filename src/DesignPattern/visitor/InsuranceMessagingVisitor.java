package designpatterns.visitor;

public class InsuranceMessagingVisitor implements Visitor{
    @Override
    public void visitAirlines(Airlines airlines) {
        System.out.println("Hello" + airlines.name + " airlines company");
    }

    @Override
    public void visitHotel(Hotel hotel) {
        System.out.println("Hello" + hotel.name + " airlines company");
    }
}
