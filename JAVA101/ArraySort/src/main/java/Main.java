import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dizinin boyutu n :");
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        System.out.print("Dizinin elemanlarını giriniz :\n");
        int[] array=new int[length];
        for(int i=0;i<length;i++)
        {
            System.out.print(i+1 +".Elemanı :");
            array[i]= scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sıralama :");
        for (int i:
             array) {
            System.out.print(i+" ");
        }
    }
}
