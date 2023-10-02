package chapter06.InlineFunction02;

public class Before {

    public int rating(Driver driver){
        return moreThanFiveLateDelivers(driver)? 2: 1;
    }
    private boolean moreThanFiveLateDelivers(Driver driver){
        return driver.numberOfLateDelivers > 5;
    }
}
