public class Main {
    public static void main(String[] args) {
        int[] numbers={10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Tekrar Sayıları");
        int[] freqCalculated=new int[numbers.length];
        int index=0;
        for (int number:
             numbers) {
            if(!isFind(freqCalculated,number,index))
            {
            int count=0;
            for (int i=0;i<numbers.length;i++)
            {
                if(number==numbers[i])
                {
                    count++;
                }
            }
            freqCalculated[index++]=number;
            System.out.println(number+" sayısı "+count+" kere tekrar edildi.");
        }
    }
}

    private static boolean isFind(int[] freqCalculated, int number, int index) {
        for(int i=0;i<=index;i++)
        {
            if (freqCalculated[i]==number)
                return true;
        }
        return false;
    }
    }
