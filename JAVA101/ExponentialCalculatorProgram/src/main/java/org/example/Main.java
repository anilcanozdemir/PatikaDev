package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Üssü alınacak sayi  :");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("Üs olacak sayi  :");
        int k=scanner.nextInt();
        int total=1;
        for(int i=1;i<=k;i++)
        {
            total*=n;
        }
        System.out.println("Total  :"+total);

    }
}