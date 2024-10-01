public class Buys {
    private double price;
    private String description;

    public Buys(double price, String description) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String
    toString() {
        return "Buys: price=" + price +
                ", description='" + description;
    }
}
