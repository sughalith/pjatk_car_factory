package pl.pjatk.service;

import pl.pjatk.model.Pizza;
import pl.pjatk.model.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PizzaService {
    private List<Pizza> pizzaList = new ArrayList<>();

    public List<Pizza> findAll() {
        return this.pizzaList;
    }

    public void addPizza(int id, int size, int price, boolean isPacked, String name) {
        Pizza myPizza = new Pizza(id, size, price, isPacked, name);
        pizzaList.add(myPizza);
    }

    public Optional<Pizza> findById(int id) {
        return pizzaList.stream().filter(pizza -> pizza.getId() == id).findFirst();
    }

    public void servePizza(int id, String customer) {
        Optional<Pizza> byId = findById(id);
        Table table = new Table(false);
        if (byId.isPresent()) {
            if (!byId.get().isPacked()) {
                table.setDirty(true);
            }
            System.out.println("Pizza " + byId.get() + " has been served to " + customer);
            cleanTable(table);
            removePizza(byId.get());
        } else {
            System.out.println("Pizza not found");
        }
    }

    public void serveMultiplePizzas(List<Integer> pizzasIds, String customer) {
        List<Optional<Pizza>> collect = pizzasIds.stream().map(i -> findById(i)).collect(Collectors.toList());
        serve(collect, customer);
    }

    public void serve(List<Optional<Pizza>> pizzas, String customer) {
        pizzas.stream().forEach(pizza -> {
            pizza.ifPresent(pizza1 -> {
                System.out.println("Pizza " + pizza1 + " has been served to " + customer);
                removePizza(pizza1);
            });

//            pizza.ifPresentOrElse(pizza1 -> {
//                        System.out.println("Pizza " + pizza1 + " has been served to " + customer);
//                        removePizza(pizza1);
//                    },
//                    () -> System.out.println("Pizza not found"));
        });
    }

    public void cleanTable(Table table) {
        table.setDirty(false);
        System.out.println("Table is cleaned up");
    }

    private void removePizza(Pizza pizza) {
        pizzaList.remove(pizza);
    }

}
