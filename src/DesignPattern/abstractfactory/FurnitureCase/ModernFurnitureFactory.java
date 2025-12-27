package designpatterns.abstractfactory.FurnitureCase;

public class ModernFurnitureFactory implements FurnitureFactory {

    private static ModernFurnitureFactory instance = null;

    private ModernFurnitureFactory() {};
    public static ModernFurnitureFactory getInstance() {
        if (instance == null) {
            instance = new ModernFurnitureFactory();
        }
        return instance;
    }

    @Override
    public Chair createChair() {
        return new MFChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new MFCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new MFSofa();
    }
}
