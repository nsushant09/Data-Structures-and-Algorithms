package Kushwaha.OOP;

public class WrapperExamples {
    public static void main(String[] args) {
        final int INCREASE = 2;
        System.out.println(INCREASE);
        final A kunal = new A();
        //When a non primitive is final you cannot reassign it
        //But you can change the value

    }
}
class A{
    final int a = 10;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
