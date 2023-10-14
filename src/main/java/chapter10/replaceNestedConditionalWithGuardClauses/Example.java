package chapter10.replaceNestedConditionalWithGuardClauses;

public class Example {
    public int payAmount(Employee employee){
        int result=0;
        if(employee.isSeparated){
            result = 0;
        }else{
            if(employee.isRetired){
                result = 0;
            }else {
                result = calculateSalary();
            }
        }
        return result;
    }
    private int calculateSalary() {
        return 10;
    }
}
