package chapter06.changeFunctionDeclaration05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfterSimpleProcessTest {

    @Test
    void simpleProcessTest(){
        // given
        int radius = 2;
        double result = 2 * Math.PI * radius;
        //when
//        double actualResult = BeforeSimpleProcess.circum(radius);
//        double actualResult = AfterSimpleProcess.circumference(radius);
        double actualResult = AfterMigrationProcess.circum(radius);
        //
        assertEquals(result, actualResult);
    }

}