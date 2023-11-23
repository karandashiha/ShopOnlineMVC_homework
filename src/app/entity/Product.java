package app.entity;

public class Product {
    private final String name;
    private final int quota;
    private final double price;
    private final String delivery;

    public Product(String name, int quota, double price, String delivery) {
        this.name = name;
        this.quota = quota;
        this.price = price;
        this.delivery = delivery;
    }

    public String getName() {
        return name;
    }

    public int getQuota() {
        return quota;
    }

    public double getPrice() {
        return price;
    }

    public String getDelivery() {
        return delivery;
    }

    public String toString() {
        return "Product: " + this.getName() + ", " + this.getQuota()
                + "psc. " + ", delivery " + this.getDelivery() + "\n";
    }
}
