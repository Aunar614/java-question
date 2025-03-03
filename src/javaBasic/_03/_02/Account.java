package javaBasic._03._02;

public class Account {
    int balance;

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        if (money > balance) {
            System.out.println("잔액부족");
        } else {
            balance -= money;
        }
    }
}
