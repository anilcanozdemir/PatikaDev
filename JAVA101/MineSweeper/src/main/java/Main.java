import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mayın tarlası boyutunu" +
                " sırasıyla satır ve sütun olmak üzere giriniz  :");
        Scanner scanner=new Scanner(System.in);
        MineSweeper mineSweeper=new MineSweeper(scanner.nextInt(),scanner.nextInt());
        mineSweeper.run();
    }
}
