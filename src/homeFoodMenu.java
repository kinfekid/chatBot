abstract class menuOnline{
    private String name;
    private int price;

    public menuOnline(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "menuOnline{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    abstract void foodOrder(String foodName, int price);
}
class onlineOrder extends menuOnline{

    public onlineOrder(String name, int price) {
        super(name, price);
    }

    @Override
    void foodOrder(String foodName, int price) {
        System.out.println(foodName);

    }
}
public class homeFoodMenu {
    public static void main(String[] args) {
        System.out.println("Welcome to our Menu");
        menuOnline foodName= new onlineOrder("pizza", 12);

    }
}
