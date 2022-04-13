import heroes.Hero;
import players.AIPlayer;

public class GameMap {

    private Field[][] map;

    private Hero playerHero;

    private AIPlayer aiHero;


    public GameMap(int height, int width, Hero playerHero) {

        System.out.println("Game map generating...");
        this.playerHero = playerHero;
        this.aiHero = new AIPlayer();
        map = new Field[height][width];

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                this.map[i][j] = new Field();
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 10; j++) {
                sb.append(map[i][j] + " ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
