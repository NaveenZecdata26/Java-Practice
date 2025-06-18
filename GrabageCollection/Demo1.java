package GrabageCollection;

//1 null assigning the reference variable
class A
{
    A()
    {
        System.out.println("A constructor");
    }
    void show()
    {
        System.out.println("show method");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a = null;
    }
}
