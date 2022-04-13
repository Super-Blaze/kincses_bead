package Units;

import AbstractClasses.Unit;

public class Mage extends Unit {

    public Mage() {
        this.name = "Mage";
        this.price = 10;
        this.minDamage = 3;
        this.maxDamage = 10;
        this.healthPoint = 6;
        this.movementSpeed = 5;
        this.initiative = 10;
    }

    public int arcaneBolt() {
        return 0;
    }


}
