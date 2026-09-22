package Latihan;
public class Prosedural{
    public static void main(String[] args) {
        String itemName1 = "Coffee";
        float price = 120000.0f;
        int quantity1 = 3;

        String itemName2 = "Sugar";
        float price2 = 30000.0f;
        int quantity2 = 2;

        String itemName3 = "Matcha Latte";
        float price3 = 15000.0f;
        int quantity3 = 4;

        System.out.println(itemName1 + " : " + price + " x " + quantity1 + " = " + calculateTotal(price, quantity1));
        System.out.println(itemName2 + " : " + price2 + " x " + quantity2 + " = " + calculateTotal(price2, quantity2));
        System.out.println(itemName3 + " : " + price3 + " x " + quantity3 + " = " + calculateTotal(price3, quantity3));
    }

    public static float calculateTotal(float price, int quantity) {
        return price * quantity;
    }
}
