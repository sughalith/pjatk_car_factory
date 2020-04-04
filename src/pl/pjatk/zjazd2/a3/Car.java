package pl.pjatk.zjazd2.a3;

public abstract class Car {
    private int numberOfDoors;
    private int gears;

    public Car(int numberOfDoors, int gears) {
        this.numberOfDoors = numberOfDoors;
        this.gears = gears;
    }

    public void drive(){
        System.out.println("Im driving");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
}
