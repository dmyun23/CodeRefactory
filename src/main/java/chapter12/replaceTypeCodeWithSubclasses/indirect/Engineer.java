package chapter12.replaceTypeCodeWithSubclasses.indirect;

import chapter12.replaceTypeCodeWithSubclasses.direct.Employee;

public class Engineer extends EmployeeType {
    public Engineer() {
        super("Engineer");
    }
    public String getType(){
        return "Engineer";
    }
}
