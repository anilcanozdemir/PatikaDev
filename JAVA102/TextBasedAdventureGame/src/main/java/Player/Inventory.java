package Player;

import Items.Armors.Armor;
import Items.Weapons.Weapon;

public class Inventory {
    boolean water;
    boolean food;
    boolean firewood;
    Weapon weapon;
    Armor armor;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }




    Inventory()
    {
         water=false;
         food=false;
         firewood=false;
         weapon=null;
         armor=null;
    }

    public boolean checkGameItems() {
       return isWater()&&isFirewood()&&isFood();
    }
}
