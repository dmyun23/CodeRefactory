package chapter06.extractMethod01;

public class Order {
    protected int amount;

    public Order(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
