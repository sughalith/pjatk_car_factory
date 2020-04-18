package pl.pjatk.zjazd2.a3;

public class ModelS extends Tesla implements SportCarInterface {
    private int horsePower;

    public ModelS(int numberOfDoors, int gears, int range, int horsePower) {
        super(numberOfDoors, gears, range);
        this.horsePower = horsePower;
    }

    public void goFaster(int powerUp) {
        this.horsePower += powerUp;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void lowPower() {
        if (getRange() <= 0) {
            System.out.println("Im low, charge me");
            throw new NoPowerException();
        }
    }
}
