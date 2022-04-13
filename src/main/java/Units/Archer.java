package Units;

import AbstractClasses.Unit;

public class Archer extends Unit {

    public Archer() {
        this.name = "Archer";
        this.price = 6;
        this.minDamage = 2;
        this.maxDamage = 4;
        this.healthPoint = 7;
        this.movementSpeed = 4;
        this.initiative = 9;
    }

    public int shot() {
        return 0;
    }

}
