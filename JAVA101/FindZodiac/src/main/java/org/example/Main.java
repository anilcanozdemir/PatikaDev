package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month,day;

        Scanner input=new Scanner(System.in);
        System.out.print("Dogdugunuz Ay:");
        month=input.nextInt();

        System.out.print("Dogdugunuz Gün");
        day=input.nextInt();

        if(month==1 && day < 22)
        {
            System.out.print("Oğlak Burcu");
        }
        else if(month == 1)
        {
            System.out.print("Kova Burcu");
        }
        else if(month==2 && day<20)
        {
            System.out.print("Kova Burcu");
        }
        else if(month == 2)
        {
            System.out.print("Balık Burcu");
        }
        else if (month==3 && day<21)
        {
            System.out.print("Balık Burcu");
        }
        else if (month==3)
        {
            System.out.print("Koç Burcu");
        }
        else if (month==4 && day<=21)
        {
            System.out.print("Koç Burcu");
        }
        else if(month==4)
        {
            System.out.print("Boğa Burcu");
        }
        else if(month==5 && day<=22)
        {
            System.out.print("Boğa Burcu");
        }
        else if (month==5)
        {
            System.out.print("İkizler Burcu");
        }
        else if(month==6 && day<=23)
        {
            System.out.print("İkizler Burcu");
        }
        else if (month==6)
        {
            System.out.print("Yengeç  Burcu");
        }
        else if(month==7 && day<=23)
        {
            System.out.print("Yengeç Burcu");
        }
        else if (month==7)
        {
            System.out.print("Aslan  Burcu");
        }
        else if(month==8 && day<=23)
        {
            System.out.print("Aslan Burcu");
        }
        else if(month==8)
        {
            System.out.print("Başak Burcu");
        }
        else if(month==9 && day<=23)
        {
            System.out.print("Başak Burcu");
        }
        else if(month==9)
        {
            System.out.print("Terazi  Burcu");
        }
        else if(month==10 && day<=23)
        {
            System.out.print("Terazi  Burcu");
        }
        else if(month==10)
        {
            System.out.print("Akrep   Burcu");
        }
        else if(month==11 && day<=22)
        {
            System.out.print("Akrep  Burcu");
        }
        else if(month==11)
        {
            System.out.print("Yay   Burcu");
        }
        else if(month==12 && day<=22)
        {
            System.out.print("Yay  Burcu");
        }
        else if(month==12)
        {
            System.out.print("Oğlak   Burcu");
        }

    }
}