package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayi giriniz      :");
        int sayi=scanner.nextInt();

        for(int i=1,j=1;i<=sayi || j<=sayi;i*=4,j*=5)
        {
            if(i<=sayi)
                System.out.println("4 ün kuvveti    :"+i);
            if(j<=sayi)
                System.out.println("5 ün kuvveti    :"+j);
        }
    }
}