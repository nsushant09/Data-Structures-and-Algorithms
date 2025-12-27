package Kushwaha.OOP.OOP5.AbstractClasses;

//child class must override all the methods of abstract parent class.
//You cannot create an object of an abstract class.
//Since you cannot create an object of an abstract classes, you cannot create a abstract constructer of abstract classes.
//Since you cannot override static method, you cannot make abstract static methods.
//You can make static method in abstract classes.
abstract public class Parent {
    int age;

    abstract void career(String name);
    abstract void partner(String name, int age);
}
