package AbstractClasses;

import java.util.Random;

public abstract class Unit {

    public String name;

    public int price;

    public int minDamage;

    public int maxDamage;

    public int healthPoint;

    public int movementSpeed;

    public int initiative;

    public int generateDamage() {
        double result = Math.random()*(this.maxDamage-this.minDamage+1)+this.minDamage;
        return (int) result;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public int getInitiative() {
        return initiative;
    }
}
