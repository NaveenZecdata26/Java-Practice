package GrabageCollection;

//4. annonymous object

class S
{
    S()
    {
        System.out.println("S constructor");
    }
    void show()
    {
        System.out.println("S show method ");
    }
}
public class Demo4 {
    public static void main(String[] args) {
        new S();
    }
}
