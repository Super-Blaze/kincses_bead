package heroes;

import AbstractClasses.Spells;
import MagicSpells.*;
import players.Player;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class HeroCreator {

    public Player player;

    public int[] prices;

    public ArrayList<Spells> availableSpells;

    public HeroCreator(Player player) {

        this.player = player;
        this.prices = new int[11];
        for (int i = 0; i < 6; i++) {
            prices[i] = 5;
        }
        availableSpells = new ArrayList<>();
        availableSpells.add(new Thunderstorm());
        availableSpells.add(new FireBall());
        availableSpells.add(new Resurrection());
        availableSpells.add(new LavaBurst());
        availableSpells.add(new EyeBeam());

        for(int i = 6; i < prices.length; i++) {
            prices[i] = availableSpells.get(i - 6).getPrice();
        }
    }

    public void displayHeroStats(Hero hero) {
        System.out.println("Hero stats:\n" +
                "1) Attack: " + hero.getAttack() +
                "\n2) Defence: " + hero.getDef() + "" +
                "\n3) Magic: " + hero.getMagic() +
                "\n4) Knowledge: " + hero.getKnowledge() +
                "\n5) Morale: " + hero.getMorale() +
                "\n6) Luck: " + hero.getLuck() +
                "\n-----------------\n" +
                "Magic Spells:\n" +
                "7) Thunderstorm: " + availableSpells.get(0).getPrice() + " gold.\n" +
                "8) Fire Ball: " + availableSpells.get(1).getPrice() + " gold.\n" +
                "9) Resurrection: " + availableSpells.get(2).getPrice() + " gold.\n" +
                "10) Lava Burst: " + availableSpells.get(3).getPrice() + " gold\n" +
                "11) Eye Beam: " + availableSpells.get(4).getPrice() + " gold.\n" +
                "----------------------------\n" +
                "What do you want to buy or develop?\n(To see your current spells, enter '99')" +
                "\nPress '0' if you have finished your character customization.");
    }

    public void changeStatusValue(int selected) {
        Float changeValue = prices[selected] * 1.1f;
        Double result = Math.ceil(changeValue.doubleValue());
        prices[selected] = result.intValue();

    }

    public void goldChecker(int selectedValue) {

        int goldChange = player.getMoney() - prices[selectedValue-1];
        if(goldChange >= 0) {
            if(selectedValue > 6) {
                player.setMoney(goldChange);
            } else {
                player.setMoney(goldChange);
                changeStatusValue(selectedValue-1);
            }

        } else {
            System.out.println("You do not have enough money!");
        }
    }

    public void developCharacter(int selectedValue, Hero testHero) {

        if(selectedValue == 1) {
            int value = testHero.getAttack() + 1;
            if(value > 10) {
                System.out.println("You have reached the maximum level of this status!\n");
            } else {
                testHero.setAttack(value);
            }

        }
        else if(selectedValue == 2) {
           int value = testHero.getDef() + 1;
           if(value > 10) {
               System.out.println("You have reached the maximum level of this status!\n");
           } else {
               testHero.setDef(testHero.getDef() + 1);
           }

        }
        else if(selectedValue == 3) {

            int value = testHero.getMagic() + 1;
            if(value > 10) {
                System.out.println("You have reached the maximum level of this status!\n");
            } else {
                testHero.setMagic(value);
            }
        }
        else if(selectedValue == 4) {

            int value = testHero.getKnowledge() + 1;
            if(value > 10) {
                System.out.println("You have reached the maximum level of this status!\n");
            } else {
                testHero.setKnowledge(value);
            }
        }
        else if(selectedValue == 5) {

            int value = testHero.getMorale() + 1;
            if(value > 10) {
                System.out.println("You have reached the maximum level of this status!\n");
            } else {
                testHero.setMorale(value);
            }

        }
        else if(selectedValue == 6) {

            int value = testHero.getLuck() + 1;
            if(value > 10) {
                System.out.println("You have reached the maximum level of this status!\n");
            } else {
                testHero.setLuck(value);
            }
        }
        else if(selectedValue == 7) {
            if(testHero.getMagicSpells().contains(this.availableSpells.get(0))) {
                System.out.println("You already have this spell!");
            } else {
                testHero.getMagicSpells().add(this.availableSpells.get(0));
            }
        }
        else if(selectedValue == 8) {
            if(testHero.getMagicSpells().contains(this.availableSpells.get(1))) {
                System.out.println("You have already this spell!");
            } else {
                testHero.getMagicSpells().add(this.availableSpells.get(1));
            }
        }
        else if(selectedValue == 9) {
            if(testHero.getMagicSpells().contains(this.availableSpells.get(2))) {
                System.out.println("You have already this spell!");
            } else {
                testHero.getMagicSpells().add(this.availableSpells.get(2));
            }
        }
        else if(selectedValue == 10) {
            if(testHero.getMagicSpells().contains(this.availableSpells.get(3))) {
                System.out.println("You have already this spell!");
            } else {
                testHero.getMagicSpells().add(this.availableSpells.get(3));
            }
        }
        else if(selectedValue == 11) {
            if(testHero.getMagicSpells().contains(this.availableSpells.get(4))) {
                System.out.println("You have already this spell!");
            } else {
                testHero.getMagicSpells().add(this.availableSpells.get(4));
            }
        }
    }

    public void heroBuilder() {
        Hero heroUnderBuild = new Hero();
        Scanner selectedValueScanner = new Scanner(System.in);
        Scanner selectedAnswerScanner = new Scanner(System.in);
        int selectedValue = 0;
        String selectedAnswer;
        while (true) {
            displayHeroStats(heroUnderBuild);
            selectedValue = selectedValueScanner.nextInt();

            if(selectedValue == 0) {
                this.player.setHero(heroUnderBuild);
                break;
            }
            if(selectedValue == 99) {
                if(heroUnderBuild.getMagicSpells().isEmpty()) {
                    System.out.println("you do not have any spells yet!\n----------------------\n");
                } else {
                    System.out.println("\nYour current spells are: \n");
                    for(Spells s : heroUnderBuild.getMagicSpells()) {
                        System.out.println("-" + s.getName());
                    }
                    System.out.println("----------------------\n");
                }

            }
            if(selectedValue <= 11) {
                System.out.println("It will cost you " + prices[selectedValue-1] + " gold. Are you sure? (y/n)");
                selectedAnswer = selectedAnswerScanner.next();
                if (Objects.equals(selectedAnswer, "y")) {
                    goldChecker(selectedValue);
                    System.out.println("\nCurrent gold balance: " + player.getMoney() + "\n");
                    developCharacter(selectedValue, heroUnderBuild);

                } else if (Objects.equals(selectedAnswer, "n")) {

                }
            }
        }
    }
}
