package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Eleman Sayisini giriniz     :");
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        System.out.print("Kümedeki Eleman Sayisini giriniz     :");
        int subCount=scanner.nextInt();
        int remainderCount=count-subCount;
        int countComb=1,subCountComb=1,remainderComb=1;
        for(int i=1;i<count;i++)
        {
            countComb*=i;
            if(i==subCount)
                subCountComb=countComb;
            if(i==remainderCount)
                remainderComb=countComb;
        }
        int total=countComb/(subCountComb*remainderComb);
        System.out.print("Sonuç :" +total);
    }
}