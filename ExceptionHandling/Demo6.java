package ExceptionHandling;


class CustomException extends RuntimeException
{
    CustomException(){}
    CustomException(String message)
    {
        super(message);
    }
}
public class Demo6 {


    public static void main(String[] args) {
        String message = "message for custom exception";

        throw new CustomException(message);
    }
}
