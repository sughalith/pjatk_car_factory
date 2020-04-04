package pl.pjatk.model;

public class Pizza {
    private int id; // max int = 2,147,483,647
    private int size;
    private int price;
    private boolean isPacked;
    private String name;

    public Pizza(int id, int size, int price, boolean isPacked, String name) {
        this.id = id;
        this.size = size;
        this.price = price;
        this.isPacked = isPacked;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public boolean isPacked() {
        return isPacked;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", price=" + price +
                ", isPacked=" + isPacked +
                ", name='" + name + '\'' +
                '}';
    }
}
