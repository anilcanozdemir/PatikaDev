public class SafeHouse extends NormalLoc {
    @Override
    boolean onLocation() {
        throw new RuntimeException();
    }
}
