import java.awt.*;

public class RestaurantFoodApp {
    public static void main(String[] args) {
        // Create menu items
        FoodMenu pizza = new FoodMenu("pizza", "Grilled bread with tomatoes, basil, and balsamic glaze", 8.99);
        FoodMenu chicken = new FoodMenu("chicken", "Grilled chicken with tomatoes, basil, and balsamic glaze", 12.99);
        FoodMenu spaghettiBolognese = new FoodMenu("Spaghetti Bolognese", "Traditional meat sauce over spaghetti", 14.99);
        FoodMenu tiramisu = new FoodMenu("Tiramisu", "Coffee-soaked ladyfingers with mascarpone cheese", 9.99);

        // Create menu categories
        MenuCategory mainFood = new MenuCategory("Main Food");
        mainFood.addItem(pizza);

        MenuCategory appetizers1 = new MenuCategory("Appetizers");
        appetizers1.addItem(chicken);

        MenuCategory mainCourses = new MenuCategory("Main Courses");
        mainCourses.addItem(spaghettiBolognese);

        MenuCategory desserts = new MenuCategory("Desserts");
        desserts.addItem(tiramisu);

        // Create the restaurant menu
        RestaurantFoodMenu restaurantMenu = new RestaurantFoodMenu();
        restaurantMenu.addCategory(mainFood);
        restaurantMenu.addCategory(mainCourses);
        restaurantMenu.addCategory(desserts);

        // Display the menu
        System.out.println("----- Restaurant Menu -----");
        for (MenuCategory category : restaurantMenu.getCategories()) {
            System.out.println("\n" + category.getCategoryName() + ":");
            for (FoodMenu item : category.getItems()) {
                System.out.println("  " + item);
            }
        }
    }
}
