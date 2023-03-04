package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int mat,fizik,turkce,kimya,muzik;
    int ders=0;
    double sum=0;

        Scanner scanner=new Scanner(System.in);

        System.out.print("mat notunuz:");
        mat=scanner.nextInt();
        if(mat>0 && mat<100){
            ders++;
            sum+=mat;
        }


        System.out.print("fizik notunuz:");
        fizik=scanner.nextInt();
        if(fizik>0 && fizik<100) {
            ders++;
            sum+=fizik;
        }

        System.out.print("turkce notunuz:");
        turkce=scanner.nextInt();
        if(turkce>0 && turkce<100) {
            ders++;
            sum += turkce;
        }

        System.out.print("kimya notunuz:");
        kimya=scanner.nextInt();
        if(kimya>0 && kimya<100) {
            ders++;
            sum += kimya;
        }

        System.out.print("muzik= notunuz:");
        muzik=scanner.nextInt();
        if(muzik>0 && muzik<100) {
            ders++;
            sum += muzik;
        }4
        double avarage=sum/ders;

        if(avarage>=55)
        {
            System.out.println("Tebrikler sınıfı geçtiniz !");
        }
        else
        {
            System.out.println("Üzgünüm sınıfı geçemediniz !");
        }
        System.out.println("Notunuz : "+avarage);


    }
}