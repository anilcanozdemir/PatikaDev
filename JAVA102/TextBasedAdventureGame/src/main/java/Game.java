import Locations.*;
import Obstacles.Bear;
import Obstacles.Vampire;
import Obstacles.Zombie;
import Player.Player;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    void start()
    {
        player=new Player();
        System.out.println("Oyuncunun ismini giriniz    :");
        Scanner scanner=new Scanner(System.in);
        player.setName(scanner.nextLine());
        player.selectChar();
        location=new SafeHouse();
        boolean result=false;
        while(location.onLocation())
        {
            if(player.getInventory().checkGameItems())
            {
                result=true;
                break;
            }
            System.out.println("Nereye gitmek istersin Savaşçı"+player.getName()+"?"+
                    "\n1.SafeHouse"+
                    "\n1.ToolStore"+
                    "\n1.Forest"+
                    "\n1.Cave"+
                    "\n1.River");
            switch (scanner.nextInt()) {
                case 1 -> location = new SafeHouse();
                case 2 -> location = new ToolStore();
                case 3 -> location = new Forest(new Vampire());
                case 4 -> location = new Cave(new Zombie());
                case 5 -> location = new River(new Bear());
            }

        }
        if(result)
        {
            System.out.println("OYUNU BAŞARIYLA BİTİRDİN SAVAŞÇI"+player.getName());
        }
        else
            System.out.println("OYUNU BAŞARIYLA BİTİREMEDİN VE SONUNLA YÜZLEŞTİN SAVAŞÇI"+player.getName());
    }
}
