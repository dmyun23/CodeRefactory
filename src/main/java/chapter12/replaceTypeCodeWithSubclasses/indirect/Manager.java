package chapter12.replaceTypeCodeWithSubclasses.indirect;

import chapter12.replaceTypeCodeWithSubclasses.direct.Employee;

public class Manager extends EmployeeType {
    public Manager() {
        super("Manager");
    }
    public String getType(){
        return "Manager";
    }
}
