package Latihan;
public class OOP {
    public static void main(String[] args) {
        Product product1 = new Product("Coffee", 120000.0f, "Starbucks");
        Product product2 = new Product("Sugar", 30000.0f, "Tiger");

        System.out.println(product1.getItemName() + " : " + product1.total(3) + " (Brand: " + product1.getBrand() + ")");
        System.out.println(product2.getItemName() + " : " + product2.total(2) + " (Brand: " + product2.getBrand() + ")");
    }
}

class Product{
    private final String itemName;
    private final float price;
    private final String brand;

    public Product(String itemName, float price, String brand) {
        this.itemName = itemName;
        this.price = price;
        this.brand = brand;
    }

    public float total(int quantity) {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public String getBrand() {
        return brand;
    }
}