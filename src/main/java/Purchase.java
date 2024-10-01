// Clase que representa una compra
public class Purchase implements Comparable<Purchase> {
    private double price;
    private String description;

    public Purchase(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Purchase: price=" + price + ", description='" + description + "'";
    }

    // Comparación de precios para ordenar las compras
    @Override
    public int compareTo(Purchase otherPurchase) {
        return Double.compare(this.price, otherPurchase.getPrice());
    }
}
