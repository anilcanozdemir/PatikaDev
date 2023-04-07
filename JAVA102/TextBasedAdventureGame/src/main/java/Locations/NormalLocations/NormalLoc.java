package Locations.NormalLocations;

import Locations.Location;
import Player.Player;

public abstract class NormalLoc extends Locations.Location {


    public NormalLoc(Player player) {
        super(player);
    }

    @Override
    public abstract boolean onLocation();

}
