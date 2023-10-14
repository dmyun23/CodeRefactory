package chapter10.decomposeConditional;

import java.time.LocalDateTime;

public class Example {
    int quantity;
    int charge;

    public int calculatePayment(Plan plan, LocalDateTime dateTime){
        if(!dateTime.isBefore(plan.summerStart) && !dateTime.isAfter(plan.summerEnd) ){
            charge =  (int)(quantity * plan.summerRate);
        }else {
            charge = (int)(quantity * plan.regularRate + plan.regularServiceCharge);
        }
        return charge;
    }

    public static void main(String[] args) {
//        Plan(LocalDateTime summerStart, LocalDateTime summerEnd, double summerRate, double regularRate, int regularServiceCharge)
        LocalDateTime summerStart = LocalDateTime.of(2023,7,1,0,0);
        LocalDateTime summerEnd = LocalDateTime.of(2023,8,31,0,0);
        double summerRate = 1000.0;
        double regularRate = 1200.0;
        int regularServiceCharge = 300;

        Plan plan = new Plan(summerStart, summerEnd,summerRate,regularRate,regularServiceCharge);
        Example example = new Example();
        LocalDateTime dueDate = LocalDateTime.now();
        int result = example.calculatePayment(plan, dueDate);
        System.out.println("result : " + result);
    }
}
