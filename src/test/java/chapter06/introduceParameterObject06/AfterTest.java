package chapter06.introduceParameterObject06;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AfterTest {

    @Test
    void readingsOutsideRangeTest() {
        // given
        After after = new After();
        Station station = new Station();
        station.name = "테스트장";
        for(int i = 1; i < 11; i++){
            int temp = 24+i;
            LocalDateTime time = LocalDateTime.of(2023,i,20,18,30,0,0);
            Reading reading = new Reading(temp, time);
            station.readings.add(reading);
        }
        NumberRange numberRange = new NumberRange(26,33);
        // when
        List<Reading> actualReadingList = after.readingsOutsideRange(station,numberRange);
        // then
        assertEquals(25, actualReadingList.get(0).temp);
        assertEquals(34, actualReadingList.get(1).temp);
    }

}