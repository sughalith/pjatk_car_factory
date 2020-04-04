package pl.pjatk;

import pl.pjatk.service.CarService;

public class Main {

    public static void main(String[] args) {
        CarService carService = new CarService();
        carService.createCar(1, "passat");
        carService.createCar(2, "golf");
        System.out.println(carService.findAll());
    }
}
