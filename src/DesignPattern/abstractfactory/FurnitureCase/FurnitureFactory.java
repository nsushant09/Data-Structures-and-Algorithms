package designpatterns.abstractfactory.FurnitureCase;

public interface FurnitureFactory {
    Chair createChair();

    CoffeeTable createCoffeeTable();

    Sofa createSofa();
}
