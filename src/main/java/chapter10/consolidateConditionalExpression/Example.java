package chapter10.consolidateConditionalExpression;

public class Example {
    public int disabilityAmount(Employee employee){
        if(employee.seniority < 2) return 0;
        if(employee.monthDiabled > 12 ) return 0;
        if(employee.isPartTime) return 0;
        return 1;
    }
}
