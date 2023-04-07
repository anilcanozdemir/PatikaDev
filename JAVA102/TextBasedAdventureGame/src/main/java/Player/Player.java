package Player;

import Characters.Archer;
import Characters.GameChar;
import Characters.Knight;
import Characters.Samurai;

import java.util.Scanner;

public class Player {

   private Inventory inventory;
    private int damage;
    private  int health;



    private  int money;
    private  String name;

    private GameChar gameChar;



    public Player()
    {
        setInventory(new Inventory());
        this.gameChar=null;
    }
    public Inventory getInventory() {
        return inventory;
    }
    public GameChar getGameChar() {
        return gameChar;
    }

    public void setGameChar(GameChar gameChar) {
        this.gameChar = gameChar;
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
        System.out.println("KARAKTERİNİ SEÇ :");
        System.out.println("1.ARCHER\n 2.KNIGHT\n 3.SAMURAI");
        Scanner scanner=new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1 -> gameChar = new Archer();
            case 2 -> gameChar = new Knight();
            case 3 -> gameChar = new Samurai();
        }
       if(gameChar!=null)
       {
           this.setDamage(gameChar.getDamage());
           this.setHealth(gameChar.getHealth());
           this.setMoney(gameChar.getMoney());
       }
       else
           System.out.println("YANLIŞ BİR SEÇİM YAPTINIZ    :");

    }
}
