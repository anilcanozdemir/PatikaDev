package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sayiyi giriniz");
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();
        double total=1;
        for (double i =2;i<=sayi;i++)
        {
            total+= (1 / i);
        }
        System.out.print("Total :"+total);
    }
}