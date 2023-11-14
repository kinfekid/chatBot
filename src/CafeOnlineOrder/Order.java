package CafeOnlineOrder;

import java.util.HashMap;
import java.util.Map;

class Order {
    private Map<String, Integer> items;

    public Order() {
        this.items = new HashMap<>();
    }

    public void addItem(String itemName, int quantity) {
        items.put(itemName, items.getOrDefault(itemName, 0) + quantity);
    }

    public void displayOrder() {
        System.out.println("----- Your Order -----");
        for (Map.Entry<String, Integer> item : items.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue() + " x $" +
                    CafeApp.cafeMenu.getPrice(item.getKey()) + " = $" +
                    (item.getValue() * CafeApp.cafeMenu.getPrice(item.getKey())));
        }
        System.out.println("-----------------------");
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Map.Entry<String, Integer> item : items.entrySet()) {
            total += item.getValue() * CafeApp.cafeMenu.getPrice(item.getKey());
        }
        return total;
    }
}
