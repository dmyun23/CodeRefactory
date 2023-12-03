package chapter12.replaceTypeCodeWithSubclasses.direct;

public class Employee {
    String name;

    public static Employee createEmployee(String name, String type) throws Exception {
        switch(type){
            case "Enginner": return new Engineer(name);
            case "Manager" : return new Manager(name);
            case "SalesPerson" : return new SalesPerson(name);
            default: throw new Exception(String.format("%s 에 해당하는 직원 유형은 없습니다.",type));
        }
    }
    public Employee(String name) {
        this.name = name;
    }
}
