package chapter12.replaceTypeCodeWithSubclasses.direct;

public class SalesPerson extends Employee{
    public SalesPerson(String name) {
        super(name);
    }
    public String getType(){
        return "SalesPerson";
    }
}
