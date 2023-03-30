import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix={ {1,2,3}, {4,5,6} };
        for (int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
        int[][] transpoze=new int[matrix[0].length][];
        for (int i=0;i<matrix[0].length;i++)
        {
            transpoze[i]=new int[matrix.length];
        }
        System.out.println(transpoze.length +"x"+ transpoze[0].length);
        for (int i=0;i<transpoze.length;i++)
        {
            for(int j=0;j<transpoze[0].length;j++)
            {
                transpoze[i][j]=matrix[j][i];
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }

    }
}
