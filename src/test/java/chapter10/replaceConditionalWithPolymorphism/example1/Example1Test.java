package chapter10.replaceConditionalWithPolymorphism.example1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example1Test {

    @Test
    void birdTest(){
        // given
        Example1 example1 = new Example1();
        Bird bird1 = new Bird("아프리카 제비",3,5, false);
        String plumage = "지쳤다";
        int airSpeedVelocity = 34;

        //when
        String actualPlumage = example1.plumage(bird1);
        int actualAirSpeedVelocity = example1.airSpeedVelocity(bird1);

        //then
        assertEquals(plumage, actualPlumage);
        assertEquals(airSpeedVelocity, actualAirSpeedVelocity);
    }
    @Test
    void birdTest2(){
        // given
        Example1After example1 = new Example1After();
        Bird bird1 = new Bird("아프리카 제비",3,5, false);
        String plumage = "지쳤다";
        int airSpeedVelocity = 34;

        //when
        String actualPlumage = example1.plumage(bird1);
        int actualAirSpeedVelocity = example1.airSpeedVelocity(bird1);

        //then
        assertEquals(plumage, actualPlumage);
        assertEquals(airSpeedVelocity, actualAirSpeedVelocity);
    }

}