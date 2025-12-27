package Kushwaha.OOP.ForSingleton;

public class Singleton {
    //creating a private constructor so that the constructor cannot be called from outside the scope of the class.
    private Singleton(){}

    //creating a private object of singleton class. The ref variable is also static because it is independent of object.
    private static Singleton instance;

    //a function named getInstance is created which can be called from outside the scope of the class which also does not require an object to be accessed since it's static
    public static Singleton getInstance(){
        //check whether 1 obj only is created or not
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
