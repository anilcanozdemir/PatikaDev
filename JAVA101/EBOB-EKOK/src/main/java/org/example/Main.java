package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("İki sayi giriniz    :");
        Scanner scanner=new Scanner(System.in);
        int firstNum=scanner.nextInt();
        int secondNum=scanner.nextInt();
        int firstTemp=firstNum;
        int secondTemp=secondNum;
        int commonDiv=1;
        int i=2;
        while(firstNum>1 && secondNum >1)
        {

            if(firstNum%i==0 && secondNum%i==0)
            {
                firstNum/=i;
                secondNum/=i;
                commonDiv*=i;
                i=1;
            }
            else if(firstNum%i==0)
            {
                firstNum/=i;
            }
            else if(secondNum%i==0)
            {
                secondNum/=i;
            }
            i++;

        }
        int CommonPower=firstTemp*secondTemp/commonDiv;
        System.out.println("EBOB  :"+ commonDiv);
        System.out.println("EKOK  :"+CommonPower);

    }
}