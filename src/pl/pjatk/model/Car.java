package pl.pjatk.model;

public class Car {
    private int id;
    private String model;

    public Car(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
