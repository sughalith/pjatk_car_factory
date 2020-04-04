package pl.pjatk.zjazd2.a3;

public abstract class Tesla extends Car {
    private int range;

    public Tesla(int numberOfDoors, int gears, int range) {
        super(numberOfDoors, gears);
        this.range = range;
    }

    public abstract void lowPower();

    public void charge(int power) {
        this.range += power;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
