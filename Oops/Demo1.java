package Oops;
class A
{
    A()
    {
        System.out.println("a constructor");
    }
    void show()
    {
        System.out.println(" a show method");
    }

}
class B extends  A
{
    B()
    {
        System.out.println("b constructor");
    }
    void show()
    {
        System.out.println(" b show method");
    }

}
public class Demo1 {
    public static void main(String[] args) {
       A a  = new A();
       B b = new B();
       a.show();
       b.show();
    }
}
