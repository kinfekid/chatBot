package RestaurantMenu;
import java.util.Scanner;
import java.util.List;

class RestaurantApp {
    public static void main(String[] args) {
        // Create menu items
        MenuItem bruschetta = new MenuItem("Bruschetta", "Grilled bread with tomatoes, basil, and balsamic glaze", 8.99);
        MenuItem spaghettiBolognese = new MenuItem("Spaghetti Bolognese", "Traditional meat sauce over spaghetti", 14.99);
        MenuItem tiramisu = new MenuItem("Tiramisu", "Coffee-soaked ladyfingers with mascarpone cheese", 9.99);

        // Create menu categories
        MenuCategory appetizers = new MenuCategory("Appetizers");
        appetizers.addItem(bruschetta);

        MenuCategory mainCourses = new MenuCategory("Main Courses");
        mainCourses.addItem(spaghettiBolognese);

        MenuCategory desserts = new MenuCategory("Desserts");
        desserts.addItem(tiramisu);

        // Create the restaurant menu
        RestaurantMenu restaurantMenu = new RestaurantMenu();
        restaurantMenu.addCategory(appetizers);
        restaurantMenu.addCategory(mainCourses);
        restaurantMenu.addCategory(desserts);

        // Display the menu
        System.out.println("----- Restaurant Menu -----");
        for (MenuCategory category : restaurantMenu.getCategories()) {
            System.out.println("\n" + category.getCategoryName() + ":");
            for (MenuItem item : category.getItems()) {
                System.out.println("  " + item);
            }
        }

        // Take user order
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter the number of the item you'd like to order (or 0 to exit):");

        while (true) {
            try {
                int userChoice = Integer.parseInt(scanner.nextLine());

                if (userChoice == 0) {
                    System.out.println("Thank you for your order. Enjoy your meal!");
                    break;
                } else if (userChoice > 0 && userChoice <= getTotalItems(restaurantMenu.getCategories())) {
                    MenuItem selectedMenuItem = getMenuItemByNumber(restaurantMenu.getCategories(), userChoice);
                    System.out.println("You've selected: " + selectedMenuItem);
                } else {
                    System.out.println("Invalid selection. Please enter a valid item number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        scanner.close();
    }

    private static int getTotalItems(List<MenuCategory> categories) {
        return categories.stream().mapToInt(category -> category.getItems().size()).sum();
    }

    private static MenuItem getMenuItemByNumber(List<MenuCategory> categories, int userChoice) {
        int count = 0;
        for (MenuCategory category : categories) {
            for (MenuItem item : category.getItems()) {
                count++;
                if (count == userChoice) {
                    return item;
                }
            }
        }
        return null;
    }
}