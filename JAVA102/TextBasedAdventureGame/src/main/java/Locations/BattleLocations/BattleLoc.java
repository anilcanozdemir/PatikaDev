package Locations.BattleLocations;

import Locations.Location;
import Obstacles.Obstacle;
import Player.Player;

public abstract class BattleLoc extends Location {
    Obstacle obstacle;

    public BattleLoc(Player player) {
        super(player);
    }

    @Override
    public boolean onLocation()
    {
        throw new RuntimeException();
    }
    void combat()
    {
        throw new RuntimeException();
    }


}
