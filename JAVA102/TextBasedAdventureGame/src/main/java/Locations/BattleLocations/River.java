package Locations.BattleLocations;

import Obstacles.Bear;
import Player.Player;

public  class River extends BattleLoc {


    public River(Bear bear, Player player) {
        super(player);
        this.setObstacle(bear);
        this.setName("Nehir");
    }
    @Override
    protected void reward() {
        if(!getPlayer().getInventory().isWater())
        {
            System.out.println(this.getName()+" dan Yemeği aldın.");
            getPlayer().getInventory().setWater(true);
        }
    }
}