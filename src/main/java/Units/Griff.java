package Units;

import AbstractClasses.Unit;

public class Griff extends Unit {

    public Griff() {
        this.name = "Griff";
        this.price = 15;
        this.minDamage = 5;
        this.maxDamage = 10;
        this.healthPoint = 30;
        this.movementSpeed = 7;
        this.initiative = 15;
    }

    public int infiniteRetaliation() {
        return 0;
    }

}
