package Kushwaha.OOP.OOP5.Interfaces;

public class ElectricalEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electrical Engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Electrical Engine stopped.");
    }

    @Override
    public void acc() {
        System.out.println("Electrical engine acclerated.");
    }
}
