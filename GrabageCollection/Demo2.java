package GrabageCollection;

//2  re-assigning the reference variable
class B
{
    B()
    {
        System.out.println("A constructor");
    }
    void show()
    {
        System.out.println("show method");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        B b = new B();
        B b1 = new B();
        b.show();
        b1.show();
        b1=b;
    }
}
