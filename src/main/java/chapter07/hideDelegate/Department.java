package chapter07.hideDelegate;


public class Department {
    protected int chargeCode;
    protected Person manager;

    public int getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(int chargeCode) {
        this.chargeCode = chargeCode;
    }

    public Person getManager() {
        return manager;
    }

    public void setPerson(Person manager) {
        this.manager = manager;
    }
}
