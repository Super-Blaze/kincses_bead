package heroes;

import AbstractClasses.Spells;
import AbstractClasses.Unit;
import Units.Archer;
import Units.Army;
import Units.Farmer;
import players.Player;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hero {
    
    private Player player;

    public int attack;

    public int def;

    public int magic;

    public int knowledge;

    public int morale;

    public int luck;

    public ArrayList<Spells> magicSpells;

    private int armyPopulation;
    //public ArrayList<Unit> units;

    private Army farmers;
    private Army archers;
    private Army griffs;
    private Army mages;
    private Army warriors;

    public int mana;

    public Hero(Player player) {
        this.attack = 1;
        this.def = 1;
        this.magic = 1;
        this.knowledge = 1;
        this.morale = 1;
        this.luck = 1;
        this.magicSpells = new ArrayList<>();
        this.mana = 100;
        this.armyPopulation = 0;
        this.player = player;
        
        farmers = new Army()
    }

    public void addUnitToPopulation(){
        armyPopulation += 1;
    }
    
    public void removeUnitFromPopulation(){
        armyPopulation -= 1;
    }


    public Army getFarmers() {
        return farmers;
    }

    public void addFarmer(Farmer farmer) {
        farmers.addUnit(farmer);
    }

    public Army getArchers() {
        return archers;
    }

    public void addArchers(Unit unit) {
        this.archers.addUnit(unit);
    }

    public Army getGriffs() {
        return griffs;
    }

    public void addGriffs(Unit unit) {
        this.griffs.addUnit(unit);
    }

    public Army getMages() {
        return mages;
    }

    public void addMages(Unit unit) {
        this.mages.addUnit(unit);
    }

    public Army getWarriors() {
        return warriors;
    }

    public void addWarriors(Unit warriors) {
        this.warriors.addUnit(warriors);
    }

    public ArrayList<Spells> getMagicSpells() {
        return magicSpells;
    }

    public void setMagicSpells(ArrayList<Spells> magicSpells) {
        this.magicSpells = magicSpells;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }


    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public int getMorale() {
        return morale;
    }

    public void setMorale(int morale) {
        this.morale = morale;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }


}
