package chapter10.replaceNestedConditionalWithGuardClauses;

public class AfterExample {
    public int payAmount(Employee employee){
        if(employee.isSeparated) return 0;
        if(employee.isRetired) return 0;
        return calculateSalary();
    }
    private int calculateSalary() {
        return 10;
    }
}
