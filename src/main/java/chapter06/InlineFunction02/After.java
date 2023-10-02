package chapter06.InlineFunction02;

public class After {
    public int rating(Driver driver){
        return driver.numberOfLateDelivers > 5? 2: 1;
    }
//    private boolean moreThanFiveLateDelivers(Driver driver){
//        return driver.numberOfLateDelivers > 5;
//    }
}
