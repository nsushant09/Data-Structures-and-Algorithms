package Kushwaha.OOP;

import java.util.Scanner;
public class DateMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Date d1 = new Date(20,1,2010);
        Date d2 = new Date(20,1,2011);
        Date temp = new Date();
        System.out.println(temp.substractDate(d2,d1));
    }
}
