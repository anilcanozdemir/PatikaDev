import java.util.Scanner;

public class MineSweeper {
    int[][] area;
    int[][] mineLocations;

    public MineSweeper(int rowNumber, int colNumber) {
        this.area=new int[rowNumber][];
        for(int i=0;i<area.length;i++)
        {
            area[i]=new int[colNumber];
        }

        setMines();
        calculateAdjMine();
    }

    private void calculateAdjMine() {
        for(int i=0;i< area.length;i++)
        {
            for (int j=0;j< area[0].length;j++)
            {
                if(area[i][j]!=-1)
                {
                    area[i][j]=adjMines(i,j);
                }
            }
        }
    }

    private void setMines() {
        mineLocations=new int[area.length*area[0].length/4][2];
        for(int i=0;i<mineLocations.length;i++)
        {
            int mineLocationX,mineLocationsY;
            do {
                mineLocationX  =(int)(Math.random()* area.length);
                mineLocationsY=(int)(Math.random()* area[0].length);
            }while (isFoundMine(mineLocationX,mineLocationsY));


            mineLocations[i][0]=mineLocationX;
            mineLocations[i][1]=mineLocationsY;
            area[mineLocationX][mineLocationsY]=-1;
        }
    }

    private  int adjMines( int x, int y) {
        int count=0;
      for(int  i=0;i<mineLocations.length;i++)
      {
          if((mineLocations[i][0]-x<=1 && mineLocations[i][0]-x>=-1)&&(mineLocations[i][1]-y<=1 &&mineLocations[i][1]-y>=-1 ) )
          {
              count++;
          }
      }
      return count;
    }

    private boolean isFoundMine(int mineLocationX, int mineLocationsY) {
        for (int i=0;i<mineLocations.length;i++)
        {
            if(mineLocations[i][0]==mineLocationX && mineLocationsY==mineLocations[i][1])
            {
                return true;
            }
        }
        return false;
    }
    private void printOpenArea() {
        for (int[] ints : area) {
            for (int j = 0; j < area[0].length; j++) {
                if (ints[j] == -1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(ints[j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void run() {
        printOpenArea();
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !\n");
        int iterator=0;
        int[][] guesses=new int[area.length*area[0].length-(area.length*area[0].length/4)][2];
        printClosedArea();
        Scanner scanner=new Scanner(System.in);
        do {
            int x,y;
            System.out.print("Satır Giriniz :");
            x=scanner.nextInt();
            System.out.print("Sütun Giriniz :");
            y=scanner.nextInt();
            guesses[iterator][0]=x;
            guesses[iterator][1]=y;
            iterator++;
            printAreaWithGuesses(guesses,iterator);
        }while (!(isFoundMine(guesses[iterator-1][0],guesses[iterator-1][1]) ) &&iterator!= guesses.length );
        if(isFoundMine(guesses[iterator-1][0],guesses[iterator-1][1] ))
        {
            System.out.println("Game Over!!");
            System.out.println("===========================");
        }
        else
        {
            System.out.println("Oyunu Kazandınız !");
            printAreaWithGuesses(guesses,iterator);
        }

    }

    private void printAreaWithGuesses(int[][] guesses, int iterator) {
        for (int i=0;i<area.length;i++) {
            for (int j = 0; j < area[0].length; j++) {
                if (isFoundGuesses(i, j,guesses,iterator)) {
                    if (area[i][j] == -1) {
                        System.out.print("*" + " ");
                    }
                    else
                    {
                        System.out.print(area[i][j] + " ");
                    }
                } else
                    System.out.print("-" + " ");
            }
            System.out.println();
        }
    }

    private boolean isFoundGuesses(int x, int y, int[][] guesses, int iterator) {
        for (int i=0;i<iterator;i++)
        {
            if(x==guesses[i][0] && y==guesses[i][1])
            {
                return true;
            }
        }
        return false;
    }

    private void printClosedArea() {
        for (int i=0;i<area.length;i++) {
            for (int j = 0; j < area[0].length; j++)
                System.out.print("-" + " ");
            System.out.println();
        }
    }


}
