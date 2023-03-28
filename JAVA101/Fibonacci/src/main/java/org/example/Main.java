package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Fibonacci eleman sayisini giriniz   :");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        int prev=1,prevPrev=0;
        for(int i=0;i<number;i++)
        {
            if(i==0)
            {
                System.out.print(prevPrev+"     ");
            }
            else if(i==1)
            {
                System.out.print(prev+"   ");
            }
            else {
                int sum=prev+prevPrev;
                System.out.print(sum+"   ");
                prevPrev=prev;
                prev=sum;



            }
        }
    }
}