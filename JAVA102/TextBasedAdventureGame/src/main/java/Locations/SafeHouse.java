package Locations;

public class SafeHouse extends NormalLoc {
    @Override
    public boolean onLocation() {
        throw new RuntimeException();
    }
}
