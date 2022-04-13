package Units;

import AbstractClasses.Unit;
import players.Player;

import java.util.List;

public class Army {
    private Player player;
    private List<Unit> units;
    private String type;

    public Army(Player player, List<Unit> units,String type) {
        this.player = player;
        this.units = units;
        this.type = type;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void addUnit(Unit unit){
        units.add(unit);
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();
        sB.append()
        return sB.toString();
    }
}
