package ExceptionHandling;

public class Demo2 {
    public static void main(String[] args) {
        try {
            System.out.println("Hello world");
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("inside catch block");
            e.printStackTrace();
            e.getMessage();
            e.toString();
        }
    }
}
