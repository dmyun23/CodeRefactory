package chapter06.extractVariable03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfterTest {

    @Test
    void price(){
        // given
//        Order order = new Order(600, 1000);
        OrderAfter order = new OrderAfter(600, 1000);
//        After after = new After();
        int price = 595100;
        // when
//        double actualPrice = after.price(order);
        double actualPrice = order.price();
        // then
        assertEquals(price, actualPrice);
    }
}