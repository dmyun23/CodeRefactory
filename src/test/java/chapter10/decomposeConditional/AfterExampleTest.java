package chapter10.decomposeConditional;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AfterExampleTest {
    @Test
    void calculatePaymentTest(){
        // given
        LocalDateTime summerStart = LocalDateTime.of(2023,7,1,0,0);
        LocalDateTime summerEnd = LocalDateTime.of(2023,8,31,0,0);
        double summerRate = 1000.0;
        double regularRate = 1200.0;
        int regularServiceCharge = 300;

        Plan plan = new Plan(summerStart, summerEnd,summerRate,regularRate,regularServiceCharge);
        Example example = new Example();
        LocalDateTime dueDate = LocalDateTime.now();
        int result = 300;
        // when
        int actualResult = example.calculatePayment(plan, dueDate);
        // then
        assertEquals(result, actualResult);
    }


}