package Locations;

import Player.Player;

public abstract class Location {

    Player player;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location(Player player) {
        this.player=player;
    }

    public abstract boolean onLocation();
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}
