import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Girilen Sayı :" );
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int greaterNumber=Integer.MAX_VALUE,lesserNumber=Integer.MIN_VALUE;
        int [] numbers= {15,12,788,1,-1,-778,2,0};
        for (int i=0;i< numbers.length;i++)
        {
            if(numbers[i]>number && numbers[i]<greaterNumber)
            {
                greaterNumber=numbers[i];
            }
            else if(numbers[i]<number && numbers[i]>lesserNumber)
            {
                lesserNumber=numbers[i];
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :"+lesserNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+greaterNumber);

    }

}

