package DesignPatterns;
class A
{
    private static A a;
    private A()
    {
    }

    public static A getINstanceOfA()
    {
        if(a == null)
        {
            return a =new A();
        }
        return a;
    }
}
public class Singleton {
    public static void main(String[] args) {
        A a = A.getINstanceOfA();
        A b = A.getINstanceOfA();
        System.out.println(a.equals(b));
    }
}
