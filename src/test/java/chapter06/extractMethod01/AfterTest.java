package chapter06.extractMethod01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AfterTest {

    @Test
    void pringOwingTest(){
        // given
        After after = new After();
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1000));
        orders.add(new Order(2000));
        orders.add(new Order(3000));
        Invoice invoice = new Invoice(orders,Clock.today(), "윤동민" );

        StringBuilder result = new StringBuilder();
        result.append("*****************");
        result.append("**** 고객 채무 ****");
        result.append("*****************");
        result.append(String.format("고객명 : %s",invoice.customer));
        result.append(String.format("채무액 : %d",6000));
        result.append(String.format("마감일 : %s",invoice.dueDate));

        // when
        String actualResult = after.pringOwing(invoice);

        // then
        assertEquals(result.toString(), actualResult);
    }
}