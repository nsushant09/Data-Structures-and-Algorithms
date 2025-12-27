package Kushwaha.OOP.OOP6.ObjectComparison;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student Kunal = new Student(12,89.76f);
        Student Rahul = new Student(5,99.2f);
        Student Yogesh = new Student(8,99.2f);

        Student[] list = {Kunal, Rahul, Yogesh};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
