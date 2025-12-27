package Kushwaha.OOP.testoop;

interface Bicycle{
    int a = 45;

    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle{
    void BlowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }


    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying brake");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying SpeedUp");
    }
}
public class cwh_54_interfaces {
    public static void main(String[] args) {

        AvonCycle cycle1 = new AvonCycle();
        System.out.println(cycle1.a); // you can create properties in Interfaces
        //you cannot modify the properties in Interfaces as they are final
    }
}
