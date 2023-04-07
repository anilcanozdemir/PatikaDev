import Locations.*;
import Locations.BattleLocations.BattleLoc;
import Locations.BattleLocations.Cave;
import Locations.BattleLocations.Forest;
import Locations.BattleLocations.River;
import Locations.NormalLocations.SafeHouse;
import Locations.NormalLocations.ToolStore;
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
        location=new SafeHouse(player);
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
                    "\n2.ToolStore"+
                    "\n3.Forest"+
                    "\n4.Cave"+
                    "\n5.River");
            switch (scanner.nextInt()) {
                case 1 -> location = new SafeHouse(player);
                case 2 -> location = new ToolStore(player);
                case 3 -> location = new Forest(new Vampire(),player);
                case 4 -> location = new Cave(new Zombie(),player);
                case 5 -> location = new River(new Bear(),player);
            }

        }
        if(result)
        {
            System.out.println("OYUNU BAŞARIYLA BİTİRDİN SAVAŞÇI "+player.getName());
        }
        else
            System.out.println("OYUNU BAŞARIYLA BİTİREMEDİN VE SONUNLA YÜZLEŞTİN SAVAŞÇI "+player.getName());
    }
}
