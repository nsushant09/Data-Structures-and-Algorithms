package Kushwaha.OOP.ForPackage;

import java.util.Scanner;

public class Testing1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setInfo();
        p2.setInfo();
        System.out.println(p1);
        System.out.println(p2);
    }
}
class Person{
    String name;
    int id;

    Person(){}
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name  : ");
        name = in.nextLine();
        System.out.println("Enter the id : ");
        id = in.nextInt();
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", id=" + id ;
    }
}
