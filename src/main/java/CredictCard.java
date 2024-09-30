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

    public boolean addPurchase(Buys buys){
        if(this.balance >= buys.getPrice()){
            this.balance -= buys.getPrice();
            this.shoppingList.add(buys);

            return true;
        }
        return false;
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
