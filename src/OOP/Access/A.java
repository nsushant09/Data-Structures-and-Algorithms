package Kushwaha.OOP.Access;

public class A {
    private int num;
    String name;
    int [] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int [num];
    }

    int getNum() {
        return num;
    }

    void setNum(int num) {
        this.num = num;
    }
}
