import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your card limit: ");
        double limit = input.nextDouble();
        CredictCard card = new CredictCard(limit);

        int exit = 1;
        while (exit != 1) {
            System.out.println("Enter the item to buy: ");
            String description = input.next();

            System.out.println("Enter the purchase price: ");
            double price = Double.valueOf(input.next());

            Buys buys = new Buys(price, description);
            boolean purchaseMade = card.addPurchase(buys);

            if (purchaseMade) {
                System.out.println("Purchase Made!");
                System.out.println("Enter 0 to exit or 1 to continue");
                exit = input.nextInt();
            }else {
                System.out.println("insufficient balance!");
                exit = 0;
            }
        }
        System.out.println("*********************");
        System.out.println("PURCHASE MADE:\n");
        for (Buys buys : card.getShoppingList()) {
            System.out.println(buys.getDescription() + " - " + buys.getPrice());
        }
        System.out.println("\n*********************");
        System.out.println("\nBalance card: " + card.getBalance());
    }
}
