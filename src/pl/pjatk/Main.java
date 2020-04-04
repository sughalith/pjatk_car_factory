package pl.pjatk;

import pl.pjatk.service.PizzaService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PizzaService pizzaService = new PizzaService();
        pizzaService.addPizza(1, 32, 10, true, "Hawajska");
        pizzaService.addPizza(2, 323, 10, true, "Hawajska");
//        System.out.println(pizzaService.findAll());
//        pizzaService.servePizza(1, "Adam");
//        System.out.println(pizzaService.findAll());

        pizzaService.serveMultiplePizzas(List.of(1, 2), "Antioch");
    }
}
