import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Clase principal para la ejecución del programa
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir el límite de la tarjeta de crédito
        System.out.print("Enter your card limit: ");
        double creditLimit = input.nextDouble();
        CreditCard creditCard = new CreditCard(creditLimit);

        boolean continueShopping = true;

        // Bucle para realizar compras
        while (continueShopping) {
            System.out.print("Enter the item description: ");
            String description = input.next();

            System.out.print("Enter the purchase price: ");
            double price = input.nextDouble();

            Purchase purchase = new Purchase(price, description);
            boolean purchaseMade = creditCard.makePurchase(purchase);

            if (purchaseMade) {
                System.out.println("Purchase successful!");

                System.out.print("Enter 0 to exit or 1 to continue: ");
                continueShopping = input.nextInt() == 1;
            } else {
                System.out.println("Insufficient balance! Exiting...");
                continueShopping = false;
            }
        }

        // Mostrar resumen de compras
        System.out.println("\n*********************");
        System.out.println("PURCHASES MADE:");

        // Ordenar y mostrar las compras realizadas
        List<Purchase> purchases = creditCard.getPurchases();
        Collections.sort(purchases);
        for (Purchase purchase : purchases) {
            System.out.println(purchase.getDescription() + " - $" + purchase.getPrice());
        }

        System.out.println("\n*********************");
        System.out.println("Remaining balance: $" + creditCard.getAvailableBalance());
        input.close();
    }
}
