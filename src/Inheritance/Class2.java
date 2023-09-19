package Inheritance;

public class Class2 extends Class1{

    public void method2()
    {
        System.out.println("You are in Method2");
    }
    public static void main(String[] args) {
        Class2 obj1= new Class2();
        obj1.method1();
    }
}
