public abstract class Location {
    Player player;
    String name;
    Location()
    {
        throw new RuntimeException();
    }

    private boolean onLocation() {
        throw new RuntimeException();
    }
}
