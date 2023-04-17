package Locations.BattleLocations;

import Obstacles.Zombie;
import Player.Player;

public class Cave extends BattleLoc {
    public Cave(Zombie zombie, Player player)
    {
        super(player);
        this.setObstacle(zombie);
        this.setName("Mağara");

    }

    @Override
    protected void reward() {
        if(!getPlayer().getInventory().isFood())
        {
            System.out.println(this.getName()+" dan Yemeği aldın.");
            getPlayer().getInventory().setFood(true);
        }
    }
}
