package chapter04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProvinceTest {
    Province sampleProvince;

    @BeforeEach
    void setup(){
        sampleProvince = SampleProvinceFactory.getSampleProvinceFactory();
    }

    @Test
    void shortfallTest(){
        // given
        int answer = 5;
        // when
        int result = sampleProvince.shortFail();
        // then
        assertEquals(answer,result);
    }

    @Test
    void profitTest(){
        // given
        int answer = 230;
        // when
        int result = sampleProvince.profit();
        // then
        assertEquals(answer, result);
    }

    @Test
    void changeProductionTest(){
        // given
        int shortFail = -6;
        int profit = 292;

        // when
        sampleProvince.getProducers().get(0).setProduction(20);
        int actualShortFail = sampleProvince.shortFail();
        int actualProfit = sampleProvince.profit();

        // then
        assertEquals(shortFail, actualShortFail);
        assertEquals(profit, actualProfit);
    }

    @Test
    void noProducersTest(){
        // given
        Province province = new Province("No Producer", new ArrayList<>(), 30,20);
        int shortFail = 30;
        int profit = 0;

        // when
        int actualShortFail = province.shortFail();
        int actualProfit = province.profit();

        // then
        assertEquals(profit, actualProfit);
        assertEquals(shortFail, actualShortFail);
    }
}