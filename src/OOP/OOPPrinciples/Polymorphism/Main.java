package Kushwaha.OOP.OOPPrinciples.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
        triangle.area();
    }
}
