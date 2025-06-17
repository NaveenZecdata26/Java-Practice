package ExceptionHandling;

class CustomeCheeckException extends Exception
{
    CustomeCheeckException(String message)
    {
        super(message);
    }
}

public class Demo7 {
    public static void main(String[] args) {

        check();
    }

    public static void check() throws CustomeCheeckException
    {
        System.out.println("hello World!!");
    }
}
