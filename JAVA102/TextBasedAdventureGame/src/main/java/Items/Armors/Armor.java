package Items.Armors;

import Items.Item;

public abstract class Armor extends Item {
   private int defencePoints;

    public int getDefencePoints() {
        return defencePoints;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }
}
