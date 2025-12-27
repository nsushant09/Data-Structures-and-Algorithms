package BookKeepingSystem;

public class Book {
    private int id;
    private String name;
    private String author;
    private Category category;

    public Book(int id, String name, String author, Category category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void update(String name, String author, Category category) {
        this.name = name;
        this.author = author;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                '}';
    }
}
