package ExceptionHandling;

import java.io.IOException;

class C
{
    public void show() throws IOException
    {
        System.out.println("A show method ");
    }
}
class D extends  C
{
    public void show() throws IOException
    {
        System.out.println("class B show method");
    }
}
public class Demo11{

    public static void main(String[] args) throws  IOException{
        C a = new C();
        a.show();
        D a1 = new D();
        a1.show();
    }
}
