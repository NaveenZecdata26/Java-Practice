package GrabageCollection;

//3 local object
class C
{
    C()
    {
        System.out.println("C constructor");
    }
    void show()
    {
        System.out.println("c show method");
    }
}
class D
{
    D()
    {
        System.out.println("D constructor");
    }
    void show()
    {
        C c = new C();
        System.out.println("D show method");
    }
}
public class Demo3 {

    public static void main(String[] args) {

        C c = new C();
        c.show();
        D d = new D();
        d.show();
    }
}
