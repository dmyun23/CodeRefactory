package chapter07.replaceTempWithOrder;

public class BeforeOrder {
    protected int quantity;
    protected Item item;

    public BeforeOrder(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    public double getPrice(){
        int basePrice = quantity * item.price;
        double discountFactor = 0.98;
        if(basePrice >1000)discountFactor -= 0.03;
        return basePrice * discountFactor;
    }

    public static void main(String[] args) {
        Item item = new Item(100);
        BeforeOrder beforeOrder = new BeforeOrder(100,item);
        System.out.println(beforeOrder.getPrice());
    }
}
