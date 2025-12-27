package Kushwaha.OOP.OOPPrinciples.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    Box(double side){
        this.w = this.h = this.l = side;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void displayInfo(){
        System.out.println("Running the box");
    }

}
