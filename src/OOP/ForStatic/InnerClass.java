package Kushwaha.OOP.ForStatic;

public class InnerClass {

    //Test is not dependent on the object of Inner class if it is static.
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return
                    "name='" + name + '\'';
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Sushant");
        Test b = new Test("Neupane");
        System.out.println(a);
        System.out.println(b);
    }
}
