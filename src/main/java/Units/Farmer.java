package Units;

import AbstractClasses.Unit;

public class Farmer extends Unit {

    public Farmer() {
        this.name = "Farmer";
        this.price = 2;
        this.minDamage = 1;
        this.maxDamage = 1;
        this.healthPoint = 3;
        this.movementSpeed = 4;
        this.initiative = 8;
    }

}
