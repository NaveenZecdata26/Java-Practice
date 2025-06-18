package GrabageCollection;

class X
{
    int i;

    X()
    {
        System.out.println("X constructor");
    }

}
class Y
{
    int i;
    Y()
    {
        System.out.println("X constructor");
    }

}
class Z
{
    X x;
    Y y;
}
public class Demo5 {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        y.i =20;
        x.i =10;
        Z z = new Z();
        z.x=x;
        z.y=y;
        x=null;
        y=null;
    }

}
