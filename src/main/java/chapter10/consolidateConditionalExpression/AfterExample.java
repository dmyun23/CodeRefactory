package chapter10.consolidateConditionalExpression;

public class AfterExample {
    public int disabilityAmount(Employee employee){
        if( isNotEligibleForDisablity(employee) ) return 0;
        else return 1;
    }
    public boolean isNotEligibleForDisablity(Employee employee){
        if( employee.seniority < 2 ||
            employee.monthDiabled > 12 ||
            employee.isPartTime
        ) {
            return true;
        } else {
            return false;
        }
    }
}
