public abstract class BattleLoc extends Location {
    Obstacle obstacle;
    BattleLoc()
    {
        throw new RuntimeException();
    }
    boolean onLocation()
    {
        throw new RuntimeException();
    }
    void combat()
    {
        throw new RuntimeException();
    }
}
