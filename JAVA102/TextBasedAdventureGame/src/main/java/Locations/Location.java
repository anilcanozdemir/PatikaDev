package Locations;

import Player.Player;

public abstract class Location {
    Player player;
    String name;

    Location() {
        throw new RuntimeException();
    }

    public abstract boolean onLocation();
}
