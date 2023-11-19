package chapter11.replaceParameterWithQuery;

public class Order {
    int quantity;
    int itemPrice;

    public int finalPrice(){
        int basprice = itemPrice * quantity;
        return discountPrice(basprice);
    }

    private int beforeDiscountPrice(int baseprice, int quantity) {
            int discountLevel = quantity > 100 ? 2 : 1;
            switch (discountLevel){
                case 1: return (int)(baseprice * 0.95);
                case 2: return (int)(baseprice * 0.90);
            }
            return 0;
    }

    private int discountPrice(int baseprice) {
        switch (getDiscountLevel()){
            case 1: return (int)(baseprice * 0.95);
            case 2: return (int)(baseprice * 0.90);
        }
        return 0;
    }
    private int getDiscountLevel(){
        return quantity > 100 ? 2 : 1;
    }
}
