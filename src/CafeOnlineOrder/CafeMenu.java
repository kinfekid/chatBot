package CafeOnlineOrder;

import java.util.HashMap;
import java.util.Map;

class CafeMenu {
    private Map<String, Double> menu;

    public CafeMenu() {
        this.menu = new HashMap<>();
        initializeMenu();
    }

    private void initializeMenu() {
        menu.put("Vanilla", 4.5);
        menu.put("Strawberry", 5.0);
        menu.put("Espresso", 2.5);
        menu.put("Latte", 3.0);
        menu.put("Cappuccino", 3.2);
        menu.put("Mocha", 3.5);
        menu.put("Iced Coffee", 3.0);
    }

    public void displayMenu() {
        System.out.println("----- Cafe Menu -----");
        for (Map.Entry<String, Double> item : menu.entrySet()) {
            System.out.println(item.getKey() + ": $" + item.getValue());
        }
        System.out.println("----------------------");
    }

    public double getPrice(String itemName) {
        return menu.getOrDefault(itemName, 0.0);
    }
}