package chapter12.replaceTypeCodeWithSubclasses.direct;

public class Engineer extends Employee{
    public Engineer(String name) {
        super(name);
    }
    public String getType(){
        return "Engineer";
    }
}
