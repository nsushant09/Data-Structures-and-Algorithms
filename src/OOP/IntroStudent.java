package Kushwaha.OOP;

public class IntroStudent {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student();
        students[0].rno = 0;
        System.out.println(students[0].rno);
        Student sushant = new Student();
        sushant.rno = 13;
        sushant.name = "Sushant";
        sushant.marks = 88.3f;
        System.out.println(sushant.rno);
        Student Yogesh = new Student(2, "Yogesh", 76.5f);
        System.out.println(Yogesh.name);
        Student utsab = new Student(1);
        Student pratyush = new Student("Pratyush");
        Student suprit = new Student(3.88f);
        System.out.println(utsab.rno);
        System.out.println(pratyush.name);
        System.out.println(suprit.marks);
        System.out.println();
        sushant.display();
        Yogesh.display();
        utsab.display();
        pratyush.display();
        suprit.display();

        Student random = new Student();
        random.display();
        Student random2 = random;
        random.rno=12;
        System.out.println(random2.rno);
    }
}
//create a class
//for every single student
class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this(13, "default person", 100.0f);
    }
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    Student(int rno){
        this.rno = rno;
    }
    Student(String name){
        this.name = name;
    }
    Student(float marks){
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    void display() {
        System.out.println("The roll no is : " + rno);
        System.out.println("The name is : " + name);
        System.out.println("The marks obtained is : " + marks);
        System.out.println();
    }
}
