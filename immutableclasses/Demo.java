package immutableclasses;
final class A
{
    private final int x;
    private final int y;

    A(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }


    @Override
    public String toString() {
        return "A['"+x+"' , '"+y+"']";
    }
}
public class Demo {
    public static void main(String[] args) {
        A a = new A(10,20);


        System.out.println(a);
    }
}
