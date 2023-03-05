package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input,sum=0;
        do {
            System.out.print("Sayi giriniz");
            input=scanner.nextInt();

            if(input % 2 == 0)
            {
                sum+=input;
            }
        }while (input%2!=1);
        System.out.print("Toplam    :"+sum);
    }
}