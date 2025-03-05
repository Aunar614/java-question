package javaBasic._05._02;

public class Item {

    private String item;
    private int price;
    private int quantity;

    public Item(String item, int price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public int getTotalPrice() {
        return price * quantity;
    }

}
