import Units.Army;

public class Field {

    private Army army;

    public Field(Army army) {
        this.army = army;
    }

    @Override
    public String toString() {
        return "[ " + "0" + " ]";
    }
}
