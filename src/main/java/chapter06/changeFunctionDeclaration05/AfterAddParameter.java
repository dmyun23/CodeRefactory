package chapter06.changeFunctionDeclaration05;

import java.util.ArrayDeque;
import java.util.Deque;

public class AfterAddParameter {
    public static Deque<Customer> reservation = new ArrayDeque<>();


    public void addReservation(Customer customer){
        priorityAddReservation(customer, false);
    }
    public void priorityAddReservation(Customer customer, boolean isPriority){
        if(!isPriority) {
            this.reservation.add(customer);
        }else {
        }
    }
}
