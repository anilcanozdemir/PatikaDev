package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Sayı Giriniz :  ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(isPrime(number,2))
        {
            System.out.println(number+" sayısı ASALDIR !");
        }
        else
            System.out.println(number+" sayısı ASAL DEĞİLDİR !");

    }

    private static boolean isPrime(int number,int divider) {
        if(divider>number/2)
            return true;
        else if(number%divider==0)
            return false;
        else
            return isPrime(number,divider+1);
    }
}