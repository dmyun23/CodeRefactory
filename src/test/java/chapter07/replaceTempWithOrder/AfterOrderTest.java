package chapter07.replaceTempWithOrder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfterOrderTest {

    @Test
    void getPriceTest(){
        // given
        Item item = new Item(100);
        AfterOrder beforeOrder = new AfterOrder(100,item);
        // when
        double price = beforeOrder.getPrice();
        // then
        double result = 9500.0;
        assertEquals(price,result);
    }

}