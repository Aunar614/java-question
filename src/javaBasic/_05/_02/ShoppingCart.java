package javaBasic._05._02;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int count;

    public void addItem(Item item) {
        items[count] = item;
        count++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < count; i++) {
            System.out.println("상품명 : " + items[i].getItem() + ", 합계 : " + items[i].getTotalPrice() + "원");
        }

        System.out.println("전체 가격 합 : " + calculateTotalPrice() + "원");
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;

        for (int i = 0; i < count; i++) {
            totalPrice += items[i].getTotalPrice();
        }

        return totalPrice;
    }
}
