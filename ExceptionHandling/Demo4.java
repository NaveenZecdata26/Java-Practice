package ExceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println("hello world");
            s.charAt(4);
            System.out.println(s);
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }
}
