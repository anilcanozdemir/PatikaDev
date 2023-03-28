package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("N Sayısı : ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        recursivePattern(N, N);
    }

    private static void recursivePattern(int n, int temp) {
        if (n > 0)

        {

            System.out.print(n+"  ");
            n -= 5;
            if(n!=temp)
                recursivePattern(n,temp);
        }
        else
        {

            recursivePatternReversed(n,temp);
        }



    }

    private static void recursivePatternReversed(int n, int temp) {
        System.out.print(n+"  ");
        if(n!=temp)
        {
            n+=5;
            recursivePatternReversed( n,  temp);
        }
    }
}