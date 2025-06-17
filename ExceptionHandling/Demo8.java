package ExceptionHandling;

public class Demo8 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("inside catch block");
        }
        finally {
            System.out.println("inside the finally block");
        }
    }
}
