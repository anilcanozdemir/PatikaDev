import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Dizinin eleman sayısını giriniz: ");
        int elemanSayisi=input.nextInt();
        int numbers[]=new int[elemanSayisi];
        double sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print("Dizinin " + i + ". elemanını giriniz: ");
            numbers[i]=input.nextInt();
            System.out.println(numbers[i]);
            sum+= (double)1/numbers[i];
        }
        System.out.println( numbers.length /sum);
    }


}
