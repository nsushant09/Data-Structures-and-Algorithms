package Kushwaha.OOP.OOP5.AbstractClasses;

public class Daughter extends Parent{
    @Override
    void career(String name) {
        System.out.println("I am going to be a "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+name+" he is "+ age);
    }
}
