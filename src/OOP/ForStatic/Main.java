package Kushwaha.OOP.ForStatic;

public class Main {
    public static void main(String[] args) {
        Human Sushant = new Human(18, "Sushant", 10000, false);
        Human Ram = new Human(12, "Ram", 5000, true);
        System.out.println(Sushant);
        System.out.println(Ram);
    }

    //this is not dependent on objects;
    static void fun() {
        //you cannot access non static stuff without referencing their instances in
        // a static context
        //hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
        //greeting();//you can't use this because it requires an instance
        //but the function you are using it in does not depend on instances
    }

    //we know that something which is ont static, belongs to an object
    void greeting() {
        fun();//you can
        System.out.println("Hello I am greeting.");
    }
}