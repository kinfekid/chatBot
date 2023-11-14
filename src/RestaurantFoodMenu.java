import java.util.ArrayList;
import java.util.List;

public class RestaurantFoodMenu {
    private List<MenuCategory> categories;

    public RestaurantFoodMenu() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(MenuCategory category) {
        categories.add(category);
    }

    public List<MenuCategory> getCategories() {
        return categories;
    }
}
