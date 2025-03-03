package javaBasic._02;

import java.io.*;

public class ProductOrderMain2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("입력할 주문의 개수를 입력하세요 : ");
        bw.flush();
        int max = Integer.parseInt(br.readLine());
        ProductOrder[] orders = new ProductOrder[max];

        int count = 1;

        while (count != max + 1) {
            bw.write(count + "번째 주문 정보를 입력하세요.\n");
            bw.flush();
            bw.write("상품명 : ");
            bw.flush();
            String productName = br.readLine();
            bw.write("가격 : ");
            bw.flush();
            int price = Integer.parseInt(br.readLine());
            bw.write("수량 : ");
            bw.flush();
            int quantity = Integer.parseInt(br.readLine());

            ProductOrder order = createOrder(productName, quantity, price);
            orders[count - 1] = order;
            count++;
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);

        bw.write("총 결제 금액 : " + totalAmount + "원");
        br.close();
        bw.close();
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
