package Units;

import AbstractClasses.Unit;

public class Warrior extends Unit {

    public Warrior() {
        this.name = "Warrior";
        this.price = 4;
        this.minDamage = 1;
        this.maxDamage = 5;
        this.healthPoint = 9;
        this.movementSpeed = 3;
        this.initiative = 8;
    }

    public int swordSwing() {
        return 0;
    }

}
