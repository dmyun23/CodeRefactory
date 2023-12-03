package chapter12.replaceTypeCodeWithSubclasses.indirect;

public class Employee {
    String name;
    EmployeeType type;

    public Employee(String name, String type) throws Exception {
        this.name = name;
        this.type = createEmployeeType(type);
    }

    private EmployeeType createEmployeeType(String type) throws Exception {

        switch (type) {
            case "SalesPerson" : return new SalesPerson();
            case "Engineer" : return new Engineer();
            case "Manager" : return new Manager();
            default: throw new Exception(String.format("%s은 해당하는 직원 유형이 아닙니다.",type));
        }
    }

    @Override
    public String toString() {
        return "Employee{ " +
                "name='" + name + "\'" +
                ", type='" + getType() +"\'" +
                "}";
    }
    private String getType() {
        return type.toString();
    }
}
