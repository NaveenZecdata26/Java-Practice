package ExceptionHandling;

public class Demo5 {
    public static void main(String[] args) {
        String s = null;
        try
        {
            System.out.println("hello");
//            System.out.println(10/0);

            System.out.println("s = " + s.charAt(5));
        }
        catch (NullPointerException | ArithmeticException e)
        {
            e.printStackTrace();
        }
    }
}
