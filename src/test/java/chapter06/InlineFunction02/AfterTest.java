package chapter06.InlineFunction02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AfterTest {

    @Test
    void ratingTest(){
        // given
        Driver driver = new Driver(6);
        int result = 2;
        After after = new After();
        // when
        int actualResult = after.rating(driver);
        // then
        assertEquals(result, actualResult);
    }
}
