package Player;

public class Player {

   private Inventory inventory;
    private int damage;
    private  int health;
    private  int money;
    private  String name;
    public Player()
    {
        setInventory(new Inventory());
    }
    public Inventory getInventory() {
        return inventory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void selectChar()
    {
        throw new RuntimeException();
    }
}
