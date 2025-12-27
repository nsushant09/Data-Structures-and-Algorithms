package designpatterns.abstractfactory.FurnitureCase;

public class VictorianFurnitureFactory implements FurnitureFactory {

    private static VictorianFurnitureFactory instance = null;

    private VictorianFurnitureFactory(){}
    public static VictorianFurnitureFactory getInstance() {
        if (instance == null) {
            instance = new VictorianFurnitureFactory();
        }
        return instance;
    }

    @Override
    public Chair createChair() {
        return new VFChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VFCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VFSofa();
    }
}
