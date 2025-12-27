package Kushwaha.OOP.OOP6.ObjectComparison;

public class Student implements Comparable<Student>{
    int roll;
    float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o ) {
        return (int) (o.marks - this.marks);
    }
}
