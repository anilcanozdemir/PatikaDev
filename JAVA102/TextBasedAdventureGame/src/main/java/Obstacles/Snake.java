package Obstacles;


import java.util.Random;

public class Snake extends Obstacle  {
    public Snake()
    {
        super();
        this.setId(4);
        Random rand=new Random();
        int damage=rand.nextInt(3)+3;
        this.setDamage(damage);
        this.setHealth(12);
        this.setMoney(0);
        this.setName("YILAN");
    }
}
