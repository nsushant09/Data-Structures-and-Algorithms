package Kushwaha.OOP.Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Sushant");
        //need to do few things
        // 1. access the data members
        // 2. modify the data members
//        ArrayList<A> list = new ArrayList<>();
        int a = obj.getNum();
        System.out.println(a);
        System.out.println(obj.name);

    }
}
