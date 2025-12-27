package ObjectHandling;

import jdk.dynalink.Operation;

import java.io.Serializable;

public class Student implements Serializable {
    int id ;
    String name ;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    void show(){
        System.out.println(name);
        System.out.println(id);
    }
}
