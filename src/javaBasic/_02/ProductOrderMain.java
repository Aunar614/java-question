package javaBasic._02;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = createOrder("두부", 2, 2000);
        orders[0] = order1;
        ProductOrder order2 = createOrder("김치", 1, 5000);
        orders[1] = order2;
        ProductOrder order3 = createOrder("콜라", 2, 1500);
        orders[2] = order3;

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);

        System.out.println("총 결제 금액 : " + totalAmount + "원");
    }

    private static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }

    private static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity + "원");
        }
    }

    private static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }
}
