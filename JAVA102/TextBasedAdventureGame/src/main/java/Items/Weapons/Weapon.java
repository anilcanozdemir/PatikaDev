package Items.Weapons;

import Items.Item;

public abstract class Weapon extends Item {
    private int damagePoints;

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}
