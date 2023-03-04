package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("3 sayı giriniz");
        a=scanner.nextInt();
       b=scanner.nextInt();
       c=scanner.nextInt();

       if(a<b && a<c)
       {
           if(b<c)
           {
                System.out.println(a+"<"+b+"<"+c);
           }
           else
           {
               System.out.println(a+"<"+c+"<"+b);
           }
       }else if(a>b && a<c)
       {
           System.out.println(b+"<"+a+"<"+c);
       }else if(a>b && a>c)
       {
           if(b>c)
           {
               System.out.println(c+"<"+b+"<"+a);
           }
           else
           {
               System.out.println(b+"<"+c+"<"+a);
           }
       }else if(a<b && a>c)
       {
           System.out.println(c+"<"+a+"<"+b);
       }
}}