package Kushwaha.OOP.OOPPrinciples.Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.setInfo();
        System.out.println(c);
    }

    static protected class Base{
        int money;
        int height;

        protected Base(){}
        protected Base(int money, int height) {
            this.money = money;
            this.height = height;
        }

    }

    static class Child extends Base{
        int weight;

        public Child(){}
        public Child(int money, int height, int weight) {
            super(money, height);
            this.weight = weight;
        }
        public Child(int weight){
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Child{" +
                    "money=" + money +
                    ", height=" + height +
                    ", weight=" + weight +
                    '}';
        }

        public void setInfo(){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the money : ");
            money = in.nextInt();
            System.out.println("Enter the height : ");
            height = in.nextInt();
            System.out.println("Enter the weight : ");
            weight = in.nextInt();

        }
    }
}

