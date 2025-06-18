package ExceptionHandling;

class A
{
    public void show() throws ArithmeticException
    {
        System.out.println("A show method ");
    }
}
class B extends  A
{
    public void show()
    {
        System.out.println("class B show method");
    }
}
public class Demo10 {

    public static void main(String[] args) {
        A a = new A();
        a.show();
        A a1 = new B();
        a1.show();
    }
}
