import java.util.ArrayList;
import java.util.List;

class MenuCategory {
    private String categoryName;
    private List<MenuItem> items;

    public MenuCategory(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getItems() {
        return items;
    }
}
