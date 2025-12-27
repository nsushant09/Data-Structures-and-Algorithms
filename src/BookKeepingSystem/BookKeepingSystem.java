package BookKeepingSystem;

import java.util.Scanner;

public class BookKeepingSystem {

    private final static Scanner sc = new Scanner(System.in);
    private final static BookOperation bookOperation = new BookOperation();

    public static void main(String[] args) {
        initializeCategories();
        showMenu();
    }

    public static void initializeCategories() {
        int noOfCategories = 3;
        System.out.println("Enter " + noOfCategories + " categories: ");
        for (int i = 0; i < noOfCategories; i++) {
            addNewCategory();
        }
    }

    public static void addNewCategory() {
        System.out.print("Enter id: ");
        int id = inputInt();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        bookOperation.categories.add(new Category(id, name));
        System.out.println();
    }

    public static void showMenu() {
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = inputInt();
            chooseOption(choice);
            System.out.println();
        } while (choice != 5);
    }

    public static void chooseOption(int choice) {
        switch (choice) {
            case 1 -> bookOperation.add();
            case 2 -> bookOperation.update();
            case 3 -> bookOperation.delete();
            case 4 -> bookOperation.getAll();
            case 5 -> {
                sc.close();
                System.out.println("Application Closed");
            }
            default -> System.out.println("Invalid choice try again");
        }
    }

    public static int inputInt() {
        return Integer.parseInt(sc.nextLine().trim());
    }

}
