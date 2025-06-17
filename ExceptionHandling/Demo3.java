package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try
        {
            int num = scanner.nextInt();
            System.out.println(num);
        }
        catch (InputMismatchException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
