package Kushwaha.OOP.ForStatic;

import com.sun.jdi.PathSearchingVirtualMachine;

//this is a demo to show initialization of static variables.
public class StaticInt {
    static int a = 4;
    static int b;

    static{
        System.out.println("I am in static block.");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + " " +StaticInt.b);
    }

}
