package Kushwaha.OOP.OOP5.AbstractClasses;

public class Son extends Parent{


    public Son(){}
    public Son(int age) {
        this.age = age;
    }

    @Override
    void career(String name) {
        System.out.println("I am going to be a "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love "+name+" she is "+ age);
    }
}
