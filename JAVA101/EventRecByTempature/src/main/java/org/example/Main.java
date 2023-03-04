package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int temp;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz :");
        temp=scanner.nextInt();
        if (temp<5)
        {
            System.out.print("Kayak gidebilirsiniz");
        }
        else if(temp>=5 &&temp<15)
        {
            System.out.print("Sinema gidebilirsiniz ");
        }
        else if(temp>15 && temp<25)
        {
            System.out.print("Piknik gidebilirsiniz ");
        }
        else if (temp>25)
        {
            System.out.print("Yüzme gidebilirsiniz ");
        }
    }
}