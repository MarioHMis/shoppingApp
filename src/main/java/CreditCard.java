import java.util.ArrayList;
import java.util.List;

// Clase principal que representa la tarjeta de crédito
public class CreditCard {
    private double creditLimit;
    private double availableBalance;
    private List<Purchase> purchases;

    public CreditCard(double creditLimit) {
        this.creditLimit = creditLimit;
        this.availableBalance = creditLimit;
        this.purchases = new ArrayList<>();
    }

    // Método para agregar una compra si hay saldo suficiente
    public boolean makePurchase(Purchase purchase) {
        if (this.availableBalance >= purchase.getPrice()) {
            this.availableBalance -= purchase.getPrice();
            this.purchases.add(purchase);
            return true;
        }
        return false;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }
}
