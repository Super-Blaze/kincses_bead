
import heroes.HeroCreator;
import players.Player;

import java.util.Scanner;

public class GameManager {

    public Player player;

    public HeroCreator heroCreator;

    public ArmyCreator armyCreator;

    private GameMap gameMap;

    public GameManager() {

    }

    public int selectDificulity() {
        Scanner sc = new Scanner(System.in);
        boolean checker = true;
        int difficulty = 0;

        while(checker) {
            System.out.println("Difficulity:\n1) Easy\n2) Medium\n3) Hard\n\nSelect difficulity: ");
            difficulty = sc.nextInt();
            if(difficulty > 3) {
                System.out.println("undeclared difficulity level! Please select an existing level!\n");
            } else {
                checker = false;
            }
        }

        return difficulty;

    }

    public void setGoldByDifficulity(int diff) {

        if(diff == 1) {
            this.player = new Player(1300);
        } else if(diff == 2) {
           this.player = new Player(1000);
        } else if (diff == 3) {
            this.player = new Player(700);
        }
    }

    public void main() {
        System.out.println("Heroes of Might & Magic\n\nWelcome to the game!");
        int selectedDiff = selectDificulity();
        setGoldByDifficulity(selectedDiff);
        System.out.println("You have " + this.player.getMoney() + " amount of gold!\n");
        heroCreator = new HeroCreator(player);
        heroCreator.heroBuilder();
        this.armyCreator = new ArmyCreator(player);
        armyCreator.displayUnitsForPurchase();
        this.gameMap = new GameMap(12, 10, player.getHero());
        System.out.println(gameMap);

    }

}
