package Locations.BattleLocations;

import Obstacles.Vampire;
import Player.Player;

public class Forest extends BattleLoc {
    public Forest(Vampire vampire, Player player)
    {
        super(player);
        this.setObstacle(vampire);
        this.setName("Orman");
    }
    @Override
    protected void reward() {
        if(!getPlayer().getInventory().isFirewood())
        {
            System.out.println(this.getName()+" dan ODUN aldın.");
            getPlayer().getInventory().setFirewood(true);
        }
    }
}
