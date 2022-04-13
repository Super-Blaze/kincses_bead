package players;

import AbstractClasses.Spells;
import AbstractClasses.Unit;
import MagicSpells.FireBall;
import Units.Farmer;
import Units.Mage;

import java.util.ArrayList;

public class AIPlayer {

    private Hero hero;

    private ArrayList<Spells> AISpells;

    private ArrayList<Unit> AIUnits;

    public AIPlayer() {
        this.hero = new Hero(this);
        this.hero.setAttack(3);
        this.hero.setDef(3);
        this.hero.setMagic(2);
        this.hero.setKnowledge(4);
        this.hero.setMorale(5);
        this.hero.setLuck(2);
        this.AISpells = new ArrayList<>();
        this.AISpells.add(new FireBall());
        this.AIUnits = new ArrayList<>();
        this.AIUnits.add(new Farmer());
        this.AIUnits.add(new Farmer());
        this.AIUnits.add(new Farmer());
        this.AIUnits.add(new Mage());
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public ArrayList<Spells> getAISpells() {
        return AISpells;
    }

    public void setAISpells(ArrayList<Spells> AISpells) {
        this.AISpells = AISpells;
    }

    public ArrayList<Unit> getAIUnits() {
        return AIUnits;
    }

    public void setAIUnits(ArrayList<Unit> AIUnits) {
        this.AIUnits = AIUnits;
    }


}
