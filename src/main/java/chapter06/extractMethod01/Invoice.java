package chapter06.extractMethod01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    protected List<Order> orders =new ArrayList<>();
    protected String dueDate;
    protected String customer;

    public Invoice(List<Order> orders, String dueDate, String customer) {
        this.orders = orders;
        this.dueDate = dueDate;
        this.customer = customer;
    }

    public List<Order> getOrders(){
        return orders;
    }
}
