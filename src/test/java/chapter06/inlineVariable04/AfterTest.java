package chapter06.inlineVariable04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfterTest {

    @Test
    void method(){
        // given
        Order order = new Order(2000);
        After after = new After();
        boolean result = true;
        // when
        boolean actualResult = after.method(order);
        // then
        assertEquals(result, actualResult);
    }
}