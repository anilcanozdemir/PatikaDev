package Locations;

import Obstacles.Obstacle;

public abstract class BattleLoc extends Location {
    Obstacle obstacle;
    BattleLoc()
    {
        throw new RuntimeException();
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
