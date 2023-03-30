import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list={3,7,3,3,2,9,10,21,1,33,9,1,2,2,4,4,6,6,9,9,1,1,8,8   };
        int[] duplicate=new int[list.length];
        int startIndex=0;
        for(int i=0;i<list.length;i++)
        {
            for(int j=0;j<list.length;j++)
            {
                if(i!=j &&list[i]==list[j] && !isFind(duplicate,list[i] ) &&  list[i]%2==0)
                {
                    duplicate[startIndex++]=list[i];
                    break;
                }
            }
        }

        for (int i=0;i<startIndex;i++)
        {
            System.out.print(duplicate[i]+" ");
        }

    }

    private static boolean isFind(int[] duplicate, int value) {
        for (int i:
                duplicate) {
            if(i==value)
            {
                return true;
            }

        }
        return false;
    }
}
