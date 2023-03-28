package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Taban değerini giriniz:     ");
        Scanner scanner= new Scanner(System.in);
        int taban,üs;
        taban=scanner.nextInt();
        System.out.print("Üs değerini giriniz :     ");
        üs=scanner.nextInt();
        System.out.println("Sonuc :     "+power(taban,üs));

    }

    private static int power(int taban, int üs) {
        if(üs==0)
            return 1;
        return taban*power(taban,üs-1);
    }
}