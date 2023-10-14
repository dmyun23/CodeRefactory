package chapter10.decomposeConditional;

import java.time.LocalDateTime;

public class AfterExample {
    int quantity;
    int charge;

    public int calculatePayment(Plan plan, LocalDateTime dateTime){
        if( isSummer(plan, dateTime) ) charge =  summerCharge(plan);
        else  charge = regularCharge(plan);
        return charge;
    }
    public boolean isSummer(Plan plan, LocalDateTime dateTime){
        if(!dateTime.isBefore(plan.summerStart) && !dateTime.isAfter(plan.summerEnd) ) return true;
        else return false;
    }
    public int summerCharge(Plan plan){
        return (int)(quantity * plan.summerRate);
    }
    public int regularCharge(Plan plan){
        return (int)(quantity * plan.regularRate + plan.regularServiceCharge);
    }
}
