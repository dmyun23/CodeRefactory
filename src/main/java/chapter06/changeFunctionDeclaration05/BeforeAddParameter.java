package chapter06.changeFunctionDeclaration05;

import java.util.ArrayDeque;
import java.util.Queue;

public class BeforeAddParameter {
    public static Queue<Customer> reservation = new ArrayDeque<>();

    public void addReservation(Customer customer){
        this.reservation.add(customer);
    }
}
