package Locations.NormalLocations;

import Locations.NormalLocations.NormalLoc;
import Player.Player;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player);
        this.setName("SafeHouse");
    }

    @Override
    public boolean onLocation() {
        getPlayer().setHealth(getPlayer().getGameChar().getHealth());
        return true;
    }
}
