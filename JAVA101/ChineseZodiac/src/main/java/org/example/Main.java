package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("DOgum Yilinizi giriniz : ");
        int remainder=scanner.nextInt()%12;
        String chineseZodiac="";
        switch (remainder)
        {
            case 0:
                chineseZodiac="Maymun";
            case 1:
                chineseZodiac="Horoz";
            case 2:
                chineseZodiac="Köpek";
            case 3:
                chineseZodiac="Domuz";
            case 4:
                chineseZodiac="Fare";
            case 5:
                chineseZodiac="Öküz";
            case 6:
                chineseZodiac="Kaplan";
            case 7:
                chineseZodiac="Tavşan";
            case 8:
                chineseZodiac="Ejderha";
            case 9:
                chineseZodiac="Yılan";
            case 10:
                chineseZodiac="At";
            case 11:
                chineseZodiac="Koyun";

        }
        System.out.print("Çin Zodyağı Burcunuz :"+chineseZodiac);
    }
}