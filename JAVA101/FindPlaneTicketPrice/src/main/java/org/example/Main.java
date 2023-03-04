package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int km,yas,tip;
        double indirimOrani=0;
        System.out.print("Mesafeyi km türünden giriniz : ");
        km=scanner.nextInt();

        System.out.print("Yasinizi giriniz : ");
        yas=scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip=scanner.nextInt();
        if(km<0 || tip>2 || tip <= 0)

        {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else{
            if (yas < 12) {
                indirimOrani = 0.5;
            } else if (yas < 24) {
                indirimOrani = 0.1;
            } else if (yas > 65) {
                indirimOrani = 0.3;
            }
            double normalTutar = km * 0.1;
            double yasIndirimi = normalTutar * indirimOrani;
            double indirimliTutar = normalTutar - yasIndirimi;
            double ciftYönİndirimi = indirimliTutar * 0.2;
            if (tip == 2) {
                indirimliTutar = (indirimliTutar - ciftYönİndirimi) * 2;
            }
            System.out.println("Toplam Tutar:" + indirimliTutar);
        }
    }
}