package BookKeepingSystem;

import java.util.ArrayList;
import java.util.Scanner;

import static BookKeepingSystem.BookKeepingSystem.inputInt;

public class BookOperation {

    public final ArrayList<Book> books = new ArrayList<Book>();
    public final ArrayList<Category> categories = new ArrayList<Category>();
    public Scanner sc = new Scanner(System.in);

    BookOperation() {
    }

    public void add() {
        System.out.println("Adding book:");
        System.out.print("Enter id: ");
        int id = inputInt();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter author's name: ");
        String author = sc.nextLine();
        Category category = enterCategory();
        if(books.add(new Book(id, name, author, category))){
            System.out.println("Book added successfully");
        }else{
            System.out.println("Could not add book");
        }
    }

    public void delete() {
        System.out.println("Deleting book:");
        System.out.print("Enter id:");
        int id = inputInt();
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
            }
        }
        System.out.println("Could not find book to delete");
    }

    public void update() {
        System.out.println("Updating Book:");
        System.out.print("Enter id: ");
        int id = inputInt();
        for (Book b : books) {
            if (b.getId() == id) {
                System.out.print("Enter new name: ");
                String name = sc.nextLine();
                System.out.print("Enter new author's name: ");
                String author = sc.nextLine();
                Category category = enterCategory();
                b.update(name, author, category);
                return;
            }
        }
        System.out.println("Could not find book to update");
    }

    public void getAll() {
        for (Book b : books) {
            System.out.println(b.toString());
        }
    }

    public Category enterCategory() {
        System.out.print("Enter category name: ");
        String categoryName = sc.nextLine();
        Category c = getCategory(categoryName);

        if (c == null) {
            System.out.println("Invalid Category");
            enterCategory();
        }
        return c;
    }

    public Category getCategory(String name) {
        for (Category c : categories) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }
}
