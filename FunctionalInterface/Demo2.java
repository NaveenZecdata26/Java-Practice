package FunctionalInterface;

@FunctionalInterface
interface inter2
{
    void show2();
}
class B implements inter2{
    public void show2()
    {
        System.out.println( "show2 method");
    }
}
public class Demo2 {
}
