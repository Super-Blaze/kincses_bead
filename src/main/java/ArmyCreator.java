import AbstractClasses.Unit;
import Units.*;
import players.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmyCreator {

    public Player player;

    public ArrayList<Unit> availableUnits;

    //public final int[] unitPrices;

    public ArmyCreator(Player player) {
        this.player = player;
        this.availableUnits = new ArrayList<>();
        availableUnits.add(new Farmer());
        availableUnits.add(new Warrior());
        availableUnits.add(new Archer());
        availableUnits.add(new Mage());
        availableUnits.add(new Griff());
        /*
        this.unitPrices = new int[5];
        for (int i = 0; i < this.unitPrices.length; i++) {
            unitPrices[i] = availableUnits.get(i).getPrice();
        } */

    }

    public boolean goldChecker(int selectedValue) {

        int goldChange = player.getMoney() - availableUnits.get(selectedValue-1).getPrice();
        if(goldChange >= 0) {
            player.setMoney(goldChange);
            return true;
        } else {
            System.out.println("You do not have enough money!");
            return false;
        }

    }

    public void addUnitForPlayer(int selectedValue) {
        switch(selectedValue){
            case 1:
                player.getHero().addFarmer(new Farmer());
                player.getHero().addUnitToPopulation();
                break;
            case 2:
                player.getHero().addWarriors(new Warrior());
                player.getHero().addUnitToPopulation();
                break;
            case 3:
                player.getHero().addArchers(new Archer());
                player.getHero().addUnitToPopulation();
                break;
            case 4:
                player.getHero().addMages(new Mage());
                player.getHero().addUnitToPopulation();
                break;
            case 5:
                player.getHero().addGriffs(new Griff());
                player.getHero().addUnitToPopulation();
                break;
        }
    }

    public void checkUserInput(int selectedValue) {
        if (selectedValue == 99) {
            System.out.println("You have the following units:\n");
            for(Unit u : this.player.getHero().getUnits()) {
                System.out.println("- " + u.getName());
            }
        }
        else if(goldChecker(selectedValue)) {
            addUnitForPlayer(selectedValue);
        }

    }

    public void displayUnitsForPurchase() {
        Scanner sc = new Scanner(System.in);
        int selectedValue = 0;

        while(true) {
            System.out.println("-------------------------------\n" +
                    "Create your army!\n" +
                    "Your gold: " + this.player.getMoney() + "\n" +
                    "1) Farmer: " + availableUnits.get(0).getPrice() + " gold.\n" +
                    "2) Warrior: " + availableUnits.get(1).getPrice() + " gold.\n" +
                    "3) Archer: " + availableUnits.get(2).getPrice() + " gold.\n" +
                    "4) Mage: " + availableUnits.get(3).getPrice() + " gold.\n" +
                    "5) Griff: " + availableUnits.get(4).getPrice() + " gold.\n\n" +
                    "What unit would you buy?\nCheck your units, type '99'\nIf you have finished, press '0'\n");

            selectedValue = sc.nextInt();
            if (selectedValue == 0) {
                break;
            }
            checkUserInput(selectedValue);
        }
    }
}
