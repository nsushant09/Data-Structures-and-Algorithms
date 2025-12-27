package FileHandling;

import java.io.*;
//
//public class WithObjects {
//    public static void main(String[] args) {
//        Student first = new Student("Sushant",1,20);
//        Student second = new Student("Yogesh",3,10);
//        try {
//            FileOutputStream fileOutputStream= new FileOutputStream("studentlist.txt");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(first);
//            objectOutputStream.writeObject(second);
//            objectOutputStream.close();
//            fileOutputStream.close();
//
//            FileInputStream fileInputStream = new FileInputStream("studentlist.txt");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            Student one = (Student) objectInputStream.readObject();
//            Student two = (Student) objectInputStream.readObject();
//            objectInputStream.close();
//            fileInputStream.close();
//            System.out.println(two.id);
//            System.out.println(one.name);
//
//        }catch (IOException | ClassNotFoundException e){
//            e.printStackTrace();
//        }
//    }
////    static class Student implements Serializable{
////        String name;
////        int roll;
////        int id;
////        Student(){}
////        Student(String name,int roll, int id){
////            this.name = name;
////            this.roll = roll;
////            this.id = id;
////        }
//
////        @Override
////        public String toString() {
////            return "Student{" +
////                    "name='" + name + '\'' +
////                    ", roll=" + roll +
////                    ", id=" + id +
////                    '}';
////        }
//    }
////}

public class WithObjects{
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("studentfile.txt");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

