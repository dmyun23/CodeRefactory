package chapter12.replaceTypeCodeWithSubclasses.direct;

public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }
    public String getType(){
        return "Manager";
    }
}
