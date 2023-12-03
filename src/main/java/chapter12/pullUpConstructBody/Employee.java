package chapter12.pullUpConstructBody;

public class Employee extends Party{

    Long id;
    int monthlyCost;

    public Employee(String name) {
        super(name);
    }
    public boolean isPrivileged() {
        return false;
    }

    protected void assignCar() {

    }

    protected void finishedConstruction(){
        if(isPrivileged()) assignCar();
    }

    public Employee(String name, Long id, int monthlyCost) {
        super(name);
        this.id = id;
        this.monthlyCost = monthlyCost;
    }
}
