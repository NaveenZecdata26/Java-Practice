package Dsa;

import java.util.Scanner;

public class ReverserNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("number before reverse'" + num + "'");
        int reversNumber = 0;
        while (num > 0) {
            reversNumber = reversNumber*10 + num%10;
            num= num/10;
        }
        System.out.println("number after reverse'" + reversNumber + "'");

    }
}
