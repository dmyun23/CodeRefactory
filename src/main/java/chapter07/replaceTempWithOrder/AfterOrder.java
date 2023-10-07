package chapter07.replaceTempWithOrder;

public class AfterOrder {
    protected int quantity;
    protected Item item;

    public AfterOrder(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    public double getPrice(){
        return getBasePrice() * getDiscountFactor();
    }
    private int getBasePrice(){
        return quantity * item.price;
    }
    private double getDiscountFactor(){
        double discountFactor = 0.98;
        if(getBasePrice() >1000)discountFactor -= 0.03;
        return discountFactor;
    }
}
