package ExceptionHandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Demo9 {

    public static void main(String[] args) {
//        case1 : it will compliation error
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try(br)
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String s = br.readLine();
            System.out.println(Integer.parseInt(s));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
