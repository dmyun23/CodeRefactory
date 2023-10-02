package chapter06.inlineVariable04;

public class Before {
    public boolean method(Order order){
        int basePrice = order.basePrice;
        return basePrice > 1000;
    }
}
