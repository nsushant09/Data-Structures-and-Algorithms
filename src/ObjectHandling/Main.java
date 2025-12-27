package ObjectHandling;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("sushant",1);
        Student p = new Student("p",2);
//        Student d = new Student("d",3);
//
//        readFile();

//        writeObject(s);
//        writeObject(p);

        ArrayList<Student> result;
        result = readFile();
        for(Student st : result){
            st.show();
        }

    }

    static void writeObject(Student studentObj){
        File file = new File("student.txt");
        ArrayList<Student> finalList = readFile();
        finalList.add(studentObj);
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

             objectOutputStream.writeObject(finalList);


            objectOutputStream.close();
            fileOutputStream.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    static ArrayList<Student> readFile(){
        File file = new File("student.txt");
        ArrayList<Student> tempObj = new ArrayList<>();
        try{
            if(!file.exists()){
                System.out.println("The file does not exist to read.");
            }
            FileInputStream fileInputStream = new FileInputStream("student.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            tempObj = (ArrayList<Student>) objectInputStream.readObject();

        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return tempObj;
    }
}
