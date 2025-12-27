package Kushwaha.OOP.OOP5.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.start();
//        car.acc();
//        car.stop();
//
//        Media carMedia = new Car();
//        car.start();
//        car.stop();
        NiceCar car = new NiceCar(new ElectricalEngine());
        car.start();
        car.acc();
        car.MediaStart();
        car.MediaStop();
        car.brake();
        car.stop();

        NiceCar petrol = new NiceCar();
        petrol.start();
        petrol.acc();
        petrol.MediaStart();
        petrol.MediaStop();
        petrol.brake();
        petrol.stop();
    }
}
