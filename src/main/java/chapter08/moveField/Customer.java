package chapter08.moveField;

import java.time.LocalDateTime;

public class Customer {
    protected String name;
    protected CustomerContract customerContract;

    public Customer(String name, double discountRate, CustomerContract customerContract) {
        this.name = name;
        this.customerContract = new CustomerContract(LocalDateTime.now());
        setDiscountRate(discountRate);
    }
    private void setDiscountRate(double discountRate) {
        this.customerContract.discountRate = discountRate;
    }
    public double getDiscountRate(){
        return customerContract.discountRate;
    }
    public void becomePreferred(){
        setDiscountRate(getDiscountRate() + 0.3);
    }
    public int applyAmount(int amount){
        return Math.subtractExact(amount, (int)(amount * getDiscountRate()));
    }

}
