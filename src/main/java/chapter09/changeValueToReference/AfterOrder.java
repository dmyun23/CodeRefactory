package chapter09.changeValueToReference;

public class AfterOrder {
    Customer customer;
    long number;

    public AfterOrder(long customerId, long number) {
        this.customer = new Customer(customerId);
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }
}
