import java.util.ArrayList;
import java.util.List;

class MenuCategory {
    private String categoryName;
    private List<FoodMenu> items;

    public MenuCategory(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    public void addItem(FoodMenu item) {
        items.add(item);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<FoodMenu> getItems() {
        return items;
    }
}
