package CafeOnlineOrder;

import java.util.Objects;
import java.util.Scanner;

public class CafeApp {
    static CafeMenu cafeMenu = new CafeMenu();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Order order = new Order();

        while (true) {
            System.out.println("\n1. Display Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Order");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    cafeMenu.displayMenu();
                    break;
                case 2:
                    placeOrder(scanner, order);
                    break;
                case 3:
                    viewOrder(order);
                    break;
                case 4:
                    System.out.println("Thank you for visiting! Your total bill is: $" + order.calculateTotal());
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void placeOrder(Scanner scanner, Order order) {
        cafeMenu.displayMenu();
        System.out.print("Enter the item you want to order: ");
        String itemName = scanner.nextLine();

        if (!Objects.equals(cafeMenu.getPrice(itemName), 0.0)) {
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            order.addItem(itemName, quantity);
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Invalid item. Please select an item from the menu.");
        }
    }

    private static void viewOrder(Order order) {
        if (!Objects.equals(order.calculateTotal(), 0.0)) {
            order.displayOrder();
            System.out.println("Total Bill: $" + order.calculateTotal());
        } else {
            System.out.println("Your order is empty. Please place an order first.");
        }
    }
}
