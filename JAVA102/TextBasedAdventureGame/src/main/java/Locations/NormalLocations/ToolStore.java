package Locations.NormalLocations;

import Items.Armors.Armor;
import Items.Armors.HeavyArmor;
import Items.Armors.LightArmor;
import Items.Armors.MediumArmor;
import Items.Item;
import Items.Weapons.Pistol;
import Items.Weapons.Rifle;
import Items.Weapons.Sword;
import Items.Weapons.Weapon;
import Player.Player;

import java.util.Scanner;

public class ToolStore extends NormalLoc {
    private final LightArmor lightArmor;
    private final MediumArmor mediumArmor;
    private final HeavyArmor heavyArmor;
    private final Rifle rifle;
    private final Sword sword;
    private final Pistol pistol;

    public ToolStore(Player player) {
        super(player);
        this.setName("ToolStore");
        lightArmor = new LightArmor();
        mediumArmor = new MediumArmor();
        heavyArmor = new HeavyArmor();
        rifle = new Rifle();
        sword = new Sword();
        pistol = new Pistol();
    }

    @Override
    public boolean onLocation() {
        menu();
        return true;
    }

    void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ToolStore' a hoşgeldin Savaşçı " + getPlayer().getName());

        System.out.println("SİLAHLARIM VAR ! ZIRHLARIM VAR ! " +
                "\n sahip olduğun gold " + getPlayer().getMoney() +
                "\n1.SİLAHLAR" +
                "\n2.ZIRHLAR");
        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("SİLAH\tHASAR\tPARA");

                System.out.println("1." + pistol.getName() + "\t" + pistol.getDamagePoints() + "\t" + pistol.getCost());
                System.out.println("2." + sword.getName() + "\t" + sword.getDamagePoints() + "\t" + sword.getCost());
                System.out.println("3." + rifle.getName() + "\t" + rifle.getDamagePoints() + "\t" + rifle.getCost());
                System.out.println("HANGİSİNİ ALMAK İSTERSİN ?");
                buy(1, (scanner.nextInt()));
            }
            case 2 -> {
                System.out.println("ZIRHLAR\tHASAR\tPARA");

                System.out.println("1." + lightArmor.getName() + "\t" + lightArmor.getDefencePoints() + "\t" + lightArmor.getCost());
                System.out.println("2." + mediumArmor.getName() + "\t" + mediumArmor.getDefencePoints() + "\t" + mediumArmor.getCost());
                System.out.println("3." + heavyArmor.getName() + "\t" + heavyArmor.getDefencePoints() + "\t" + heavyArmor.getCost());
                System.out.println("HANGİSİNİ ALMAK İSTERSİN ?");
                buy(2, (scanner.nextInt()));
            }
        }


    }

    private void buy(int type, int itemId) {
        Item item=null;
        switch (type) {
            case 1 -> {
                switch (itemId) {
                    case 1 -> {
                        item = pistol;


                    }
                    case 2 -> {
                        item = sword;

                    }
                    case 3 -> {
                        item = rifle;
                    }

                }
            }
            case 2 -> {
                switch (itemId) {
                    case 1 -> {
                        item = lightArmor;
                    }
                    case 2 -> {
                        item = mediumArmor;
                    }
                    case 3 -> {
                        item = heavyArmor;
                    }
                }
            }
        }
        if(item.getCost()<getPlayer().getMoney())
        {
            switch (type) {
                case 1 -> {
                    getPlayer().setMoney(getPlayer().getMoney() - item.getCost());
                    getPlayer().getInventory().setWeapon((Weapon) item);
                }
                case 2 -> {
                    getPlayer().setMoney(getPlayer().getMoney() - item.getCost());
                    getPlayer().getInventory().setArmor((Armor) item);
                }
            }
        }
        else
            System.out.println("PARAN YETMİYOR !!!");

    }


}
