package Kushwaha.OOP.ForStatic;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;


    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
        Human.message();
    }

    static void message(){
        System.out.println("Hello World.");
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", married=" + married +
                ", population=" + population +
                '}';
    }
}
