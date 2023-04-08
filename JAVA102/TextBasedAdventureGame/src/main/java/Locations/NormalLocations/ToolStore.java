package Locations.NormalLocations;

import Items.Armors.HeavyArmor;
import Items.Armors.LightArmor;
import Items.Armors.MediumArmor;
import Items.Weapons.Pistol;
import Items.Weapons.Rifle;
import Items.Weapons.Sword;
import Player.Player;

import java.util.Scanner;

public class ToolStore extends NormalLoc {
    private final LightArmor lightArmor ;
    private final MediumArmor mediumArmor ;
    private final HeavyArmor heavyArmor;
    private final Rifle rifle ;
    private final Sword sword ;
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
    void menu()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ToolStore' a hoşgeldin Savaşçı "+getPlayer().getName());

            System.out.println("SİLAHLARIM VAR ! ZIRHLARIM VAR ! " +
                "\n1.SİLAHLAR" +
                "\n2.ZIRHLAR");
        switch (scanner.nextInt()) {
            case 1 -> {
                System.out.println("SİLAH\tHASAR\tPARA");

                System.out.println("1."+pistol.getName() + "\t" + pistol.getDamagePoints() + "\t" + pistol.getCost());
                System.out.println("2."+sword.getName() + "\t" + sword.getDamagePoints() + "\t" + sword.getCost());
                System.out.println("3."+rifle.getName() + "\t" + rifle.getDamagePoints() + "\t" + rifle.getCost());
                System.out.println("HANGİSİNİ ALMAK İSTERSİN ?");
                buy(1,(scanner.nextInt()));
            }
            case 2 -> {
                System.out.println("ZIRHLAR\tHASAR\tPARA");

                System.out.println("1."+lightArmor.getName() + "\t" + lightArmor.getDefencePoints() + "\t" + lightArmor.getCost());
                System.out.println("2."+mediumArmor.getName() + "\t" + mediumArmor.getDefencePoints() + "\t" + mediumArmor.getCost());
                System.out.println("3."+heavyArmor.getName() + "\t" + heavyArmor.getDefencePoints() + "\t" + heavyArmor.getCost());
                System.out.println("HANGİSİNİ ALMAK İSTERSİN ?");
                buy(2,(scanner.nextInt()));
            }
        }


    }

    private void buy(int type, int itemId) {
       switch (type)
       {
           case 1:
               switch (itemId) {
                   case 1 -> {
                       if (pistol.getCost() < getPlayer().getMoney()) {
                           getPlayer().setMoney(getPlayer().getMoney() - pistol.getCost());
                           getPlayer().getInventory().setWeapon(pistol);
                       } else {
                           System.out.println("PARAN BUNA YETMİYOR SAVAŞÇI GİT BİRAZ PARA BUL BANA");
                       }
                   }
                   case 2 -> {
                       if (sword.getCost() < getPlayer().getMoney()) {
                           getPlayer().setMoney(getPlayer().getMoney() - sword.getCost());
                           getPlayer().getInventory().setWeapon(sword);
                       } else {
                           System.out.println("PARAN BUNA YETMİYOR SAVAŞÇI GİT BİRAZ PARA BUL BANA");

                       }
                   }
                   case 3 -> {
                       if (rifle.getCost() < getPlayer().getMoney()) {
                           getPlayer().setMoney(getPlayer().getMoney() - rifle.getCost());
                           getPlayer().getInventory().setWeapon(rifle);
                       } else {
                           System.out.println("PARAN BUNA YETMİYOR SAVAŞÇI GİT BİRAZ PARA BUL BANA");

                       }
                   }
               }
           case 2:
               switch (itemId) {
                   case 1 -> {
                       if (lightArmor.getCost() < getPlayer().getMoney()) {
                           getPlayer().setMoney(getPlayer().getMoney() - lightArmor.getCost());
                           getPlayer().getInventory().setArmor(lightArmor);
                       } else {
                           System.out.println("PARAN BUNA YETMİYOR SAVAŞÇI GİT BİRAZ PARA BUL BANA");
                       }
                   }
                   case 2 -> {
                       if (mediumArmor.getCost() < getPlayer().getMoney()) {
                           getPlayer().setMoney(getPlayer().getMoney() - mediumArmor.getCost());
                           getPlayer().getInventory().setArmor(mediumArmor);
                       } else {
                           System.out.println("PARAN BUNA YETMİYOR SAVAŞÇI GİT BİRAZ PARA BUL BANA");

                       }
                   }
                   case 3 -> {
                       if (heavyArmor.getCost() < getPlayer().getMoney()) {
                           getPlayer().setMoney(getPlayer().getMoney() - heavyArmor.getCost());
                           getPlayer().getInventory().setArmor(heavyArmor);
                       } else {
                           System.out.println("PARAN BUNA YETMİYOR SAVAŞÇI GİT BİRAZ PARA BUL BANA");

                       }
                   }
               }
       }
    }


}
