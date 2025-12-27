package Kushwaha.OOP;

public class InnerClass {
    //if the inner class is non static then the object of outerclass should load the inner class i.e car
    static class Car{
        String name;
        int mode;

        public Car(String name, int mode) {
            this.name = name;
            this.mode = mode;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", mode=" + mode +
                    '}';
        }
    }
    public static void main(String [] args){
        Car c = new Car("Ford", 2003);
    }
}
