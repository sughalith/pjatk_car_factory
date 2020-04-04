package pl.pjatk.service;

import pl.pjatk.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public CarService() {
    }

    public List<Car> findAll() {
        return cars;
    }

    public void createCar(int id, String model) {
        Car car = new Car(id, model);
        cars.add(car);
    }

    public void removeCar(int id){

    }

    public Car findById(int id){
        Optional<Car> foundCarr = cars.stream().filter(car -> car.getId() == id).findFirst();
        return foundCarr.orElse(new Car(1, "passat"));
    }

    public List<Car> findByModel(String model){
        return new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }
}
