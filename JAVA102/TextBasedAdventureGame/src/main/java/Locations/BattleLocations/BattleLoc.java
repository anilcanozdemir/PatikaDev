package Locations.BattleLocations;

import Locations.Location;
import Obstacles.Obstacle;
import Player.Player;

import java.util.Arrays;
import java.util.Scanner;

public abstract class BattleLoc extends Location {
    Obstacle obstacle;

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public BattleLoc(Player player) {
        super(player);
    }

    @Override
    public boolean onLocation()
    {
        System.out.println(this.getName()+"'e ulaştın.İçeride"+this.getObstacle().getQuantity()
                +"adet"+this.getObstacle().getName()+"var.Savaşmak ister misin?"
                +"\n1.EVET"+
                "\n2.HAYIR");
        Scanner scanner=new Scanner(System.in);
        return switch (scanner.nextInt()) {
            case 1 -> combat();
            case 2 -> true;
            default -> false;
        };
    }
    boolean combat()
    {
        int[] FoeHps=new int[obstacle.getQuantity()];
        for(int i=0;i<obstacle.getQuantity();i++)
        {
            FoeHps[i]=obstacle.getHealth();
        }
        int[] temp=new int[obstacle.getQuantity()];
        Arrays.fill(temp,0);
        int index=0;
        while(index<FoeHps.length)
        {
            FoeHps[index]-= getPlayer().getDamage();
            System.out.println(getPlayer().getName()+" "+obstacle.getName()+" e "+getPlayer().getDamage()+"kadar vuruyor ve rakibin canı"+FoeHps[index]+"kalıyor.");
            if (FoeHps[index]>0)
            {
                getPlayer().setHealth(getPlayer().getHealth()-obstacle.getDamage());

                if(getPlayer().getHealth()<=0)
                {
                    System.out.println(obstacle.getName()+" "+getPlayer().getName()+" e "+obstacle.getDamage()+"kadar vuruyor ve ölüyosun.a");
                    return false;
                }
                System.out.println(obstacle.getName()+" "+getPlayer().getName()+" e "+obstacle.getDamage()+"kadar vuruyor ve canın"+getPlayer().getHealth()+"kalıyor.");
            }
            else {
                FoeHps[index]=0;
                System.out.println(obstacle.getName()+"den "+obstacle.getMoney()+" para aldın.");
                getPlayer().setMoney(getPlayer().getMoney()+obstacle.getMoney());
                index++;
            }
        }
        reward();
        return true;
    }

    protected abstract void reward();


}
