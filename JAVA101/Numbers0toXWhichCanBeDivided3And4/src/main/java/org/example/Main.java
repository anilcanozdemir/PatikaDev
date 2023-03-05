package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Sayı Giriniz  :");
        int sayi=scanner.nextInt();
        for (int i=1;i<=sayi;i++)
        {
            if(i%3==0 && i%4==0)
            {
                System.out.println(i);
            }
        }
    }
}