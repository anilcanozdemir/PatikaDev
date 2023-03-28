package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Kaç tane sayı gireceksiniz:");
        Scanner scanner=new Scanner(System.in);
        int numberOfEntries=scanner.nextInt();
        int max=0, min=Integer.MAX_VALUE;
        for(int i=0;i<numberOfEntries;i++)
        {
            System.out.print((i+1)+". Sayıyı giriniz  :");
            int newEntry=scanner.nextInt();
            max=Integer.max(max,newEntry);
            min=Integer.min(min,newEntry);

        }
        System.out.println("En büyük sayı   :"+max);
        System.out.println("En küçük sayı   :"+min);

    }
}