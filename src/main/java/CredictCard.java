import java.util.ArrayList;
import java.util.List;

public class CredictCard {
    private double creditLimit;
    private double balance;
    private List<Buys> shoppingList;

    public CredictCard(double creditLimit) {
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.shoppingList = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public List<Buys> getShoppingList() {
        return shoppingList;
    }
}
