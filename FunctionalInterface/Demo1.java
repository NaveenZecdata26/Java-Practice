package FunctionalInterface;

interface inter1
{
    void show();
}
class A implements  inter1{
    public void show()
    {
        System.out.println("show method ");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}
