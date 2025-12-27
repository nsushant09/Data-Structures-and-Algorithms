package Kushwaha.OOP.OOPPrinciples.Inheritance;

public class BoxWeight extends Box{
    int weight;

    public BoxWeight(int weight) {
        this.weight = weight;
    }

    public BoxWeight(double side, int weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, int weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public BoxWeight(Box old, int weight) {
        super(old);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BoxWeight{" +
                "l=" + l +
                ", h=" + h +
                ", w=" + w +
                ", weight=" + weight +
                '}';
    }
}
