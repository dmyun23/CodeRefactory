package chapter12.replaceTypeCodeWithSubclasses.indirect;

import chapter12.replaceTypeCodeWithSubclasses.direct.Employee;

public class SalesPerson extends EmployeeType {
    public SalesPerson() {
        super("SalesPerson");
    }
    public String getType(){
        return "SalesPerson";
    }
}
