package Locations.BattleLocations;

import Items.Armors.Armor;
import Items.Armors.HeavyArmor;
import Items.Armors.LightArmor;
import Items.Armors.MediumArmor;
import Items.Weapons.Pistol;
import Items.Weapons.Rifle;
import Items.Weapons.Sword;
import Items.Weapons.Weapon;
import Obstacles.Snake;
import Player.Player;

import java.util.Scanner;

public class Mine extends BattleLoc {
    public Mine(Snake snake, Player player) {
        super(player);
        this.setObstacle(snake);
        this.setName("Mine");
    }

    @Override
    protected void reward() {
        /*
        NOTHING 0-45
        WEAPON 45-60
        ARMOR 60-75
        MONEY 75-100
         */
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 100);
        if (random < 45) {
            //NOTHING

            System.out.println(this.getName() + " dan hiçbir şey alamadın.ŞANSSIZLIK!");
        } else if (random < 60) {
            //WEAPON

            random = (int) (Math.random() * 100);
            /*
            Tüfek Kazanma İhtimali : 0-20%
            Kılıç Kazanma İhtimali : 20-50%
            Tabanca Kazanma İhtimali : 50-100%
             */
            Weapon weapon;

            if (random < 50) {
                //Tabanca

                weapon = new Pistol();

            } else if (random < 70) {
                //Sword

                weapon = new Sword();
            } else {
                //Rifle

                weapon = new Rifle();
            }
            System.out.println("Yaratıklardan Silah Elde ettin.Kullanmak ister misin ?"

                    + "\nDüşen silah     :" + weapon.getName() + " hasarı     " + weapon.getDamagePoints()
                    + "\nDeğiştirmek ister misin?"
                    + "\n1.EVET"
                    + "\n2.HAYIR");
            if( this.getPlayer().getInventory().getWeapon()!=null)
                System.out.println( "Şu anki silahin     :" + this.getPlayer().getInventory().getWeapon().getName() + "hasarı    "
                    + this.getPlayer().getInventory().getWeapon().getDamagePoints());
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    getPlayer().getInventory().setWeapon(weapon);
                    break;
                case 2:
                    break;
            }
        } else if (random < 75) {
            //ARMOR
            /*
            Ağır Zırh Kazanma İhtimali : 20%


            Orta Zırh Kazanma İhtimali : 30%


    "       Hafif Zırh Kazanma İhtimali : 50%
             */

            random = (int) (Math.random() * 100);
            Armor armor;

            if (random < 50) {
                armor= new LightArmor();

            } else if (random < 80) {
                armor= new MediumArmor();
            } else
            {
                armor= new HeavyArmor();
            }
            System.out.println("Yaratıklardan Zırh Elde ettin.Kullanmak ister misin ?"

                    + "\nDüşen zırh     :" + armor.getName() + " hasar koruması     " + armor.getDefencePoints()
                    + "\nDeğiştirmek ister misin?"
                    + "\n1.EVET"
                    + "\n2.HAYIR");
            if( this.getPlayer().getInventory().getArmor()!=null)
                System.out.println( "Şu anki zırhın     :" + this.getPlayer().getInventory().getArmor().getName() + "hasarı    "
                    + this.getPlayer().getInventory().getArmor().getDefencePoints());
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    getPlayer().getInventory().setArmor(armor);
                    break;
                case 2:
                    break;
            }
        } else
        {
            //MONEY
            /*10 Para Kazanma İhtimali: 20%


            5 Para Kazanma İhtimali: 30%


            1 Para Kazanma İhtimali: 50%

             */
            int money;
            random = (int) (Math.random() * 100);
            if (random<50)
            {
                money=1;
            }
            if (random<80)
            {
                money=5;
            }
            else
            {
                money=10;
            }
            this.getPlayer().setMoney(this.getPlayer().getMoney()+money);
            System.out.println("Yaratıklardan "+money+"kadar para düştü.");
        }

    }
}
