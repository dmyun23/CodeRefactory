package chapter09.changeValueToReference;


public class Order {
    Customer customer;
    long number;

    public Order(long customerId, long number) {
        this.customer = new Customer(customerId);
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }
}
