package designpatterns.abstractfactory.FurnitureCase;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your furniture type : ");
        System.out.println("1. Modern Furniture");
        System.out.println("2. Victorian Furniture");
        System.out.println();

        int input = sc.nextInt();
        FurnitureFactory furnitureFactory = null;

        switch (input) {
            case 1 -> {
                furnitureFactory = ModernFurnitureFactory.getInstance();
                System.out.println("Selected Modern Furniture");
            }
            case 2 -> {
                furnitureFactory = VictorianFurnitureFactory.getInstance();
                System.out.println("Selected Victorian Furniture");
            }
            default -> System.out.println("Invalid Input");
        }

        if (furnitureFactory != null) {
            Chair chair = furnitureFactory.createChair();
            Sofa sofa = furnitureFactory.createSofa();
            CoffeeTable coffeeTable = furnitureFactory.createCoffeeTable();

            System.out.println(chair);
            System.out.println(sofa);
            System.out.println(coffeeTable);
        }
    }
}
