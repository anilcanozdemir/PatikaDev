package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sayi giriniz    :");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        if(isPalindrome(input))
        {
            System.out.println(input+"Palindrom bir sayıdır.");
        }
        else
            System.out.println(input+"Palindrom bir sayı değildir.");
    }

    private static boolean isPalindrome(int input) {
        int reversed=0,temp=input;

        while(input >0)
        {
            reversed*=10;
            reversed+=input%10;
            input/=10;
        }
        System.out.println(input);
        System.out.println(reversed);
        if(temp==reversed)
        {
            return true;
        }
        return false;
    }
}