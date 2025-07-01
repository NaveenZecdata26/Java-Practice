package Dsa;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        System.out.println("number before reverse'" + num + "'");
        int reversNumber = 0;
        while (num > 0) {
            reversNumber = reversNumber*10 + num%10;
            num= num/10;
        }
       if(temp == reversNumber)
       {
           System.out.println("number is palindrome'" + temp + "'");

       }
    }
}
