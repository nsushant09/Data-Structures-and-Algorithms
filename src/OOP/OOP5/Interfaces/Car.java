package Kushwaha.OOP.OOP5.Interfaces;

public class Car implements Brake,Engine,Media {

    @Override
    public void brake() {
        System.out.println("i brake like a normal car.");
    }

    @Override
    public void start() {
        System.out.println("i start as a normal car.");
    }

    @Override
    public void stop() {
        System.out.println("i stop as a normal car.");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate as a normal car.");
    }
}
