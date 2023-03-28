package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int sum=0;
        for (int i=1;i<=number/2;i++)
        {
            if(number%i==0)
            {

                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(number==sum)
            System.out.println(number+" Mükemmel sayıdır");
        else
            System.out.println(number+" Mükemmel sayı değildir.");
    }
}