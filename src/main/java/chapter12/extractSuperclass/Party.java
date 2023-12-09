package chapter12.extractSuperclass;

public class Party {
    String name;
    public Party(String name) {
        this.name = name;
    }
    private int monthlyCost() {
        return 0;
    }
    public String getName() {
        return name;
    }
    public int annualCost(){
        return monthlyCost() * 12;
    }

}
