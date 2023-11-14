package RestaurantMenu;
import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {
    private List<MenuCategory> categories;

    public RestaurantMenu() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(MenuCategory category) {
        categories.add(category);
    }

    public List<MenuCategory> getCategories() {
        return categories;
    }
}
