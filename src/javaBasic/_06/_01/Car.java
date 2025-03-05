package javaBasic._06._01;

public class Car {
    private String carName;
    private static int totalCars;

    public Car(String carName) {
        System.out.println("차량 구입, 이름 : " + carName);
        this.carName = carName;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수 : " + totalCars);
    }
}
