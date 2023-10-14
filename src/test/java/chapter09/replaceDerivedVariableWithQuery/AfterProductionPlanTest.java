package chapter09.replaceDerivedVariableWithQuery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfterProductionPlanTest {
    @Test
    void getProductionTest(){
        // given
        AfterProductionPlan afterProductionPlan = new AfterProductionPlan();
        // when
        afterProductionPlan.applyAdjustment(new Adjustment(1));
        afterProductionPlan.applyAdjustment(new Adjustment(2));
        afterProductionPlan.applyAdjustment(new Adjustment(3));
        int result = 6;
        int actualResult = afterProductionPlan.getProduction();
        //then
        assertEquals(result,actualResult);

    }

}