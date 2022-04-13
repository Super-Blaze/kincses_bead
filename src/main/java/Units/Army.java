package Units;

import AbstractClasses.Unit;
import players.Player;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Army {
    private Player player;
    private Queue<Unit> units;
    private String type;

    public Army(Player player,String type) {
        this.player = player;
        this.type = type;

        units = new LinkedList<>();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Queue<Unit> getUnits() {
        return units;
    }

    public void addUnit(Unit unit){
        units.add(unit);
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder();
        sB.append(type).append(": ");
        for (Unit unit : units){
            sB.append(unit).append(" ");
        }
        return sB.toString();
    }
}
