package chapter12.replaceSubclassWithDelegate.oneSubclass;

public class PremiumBookingDelegate {
    Extras extras;
    Booking booking;
    public PremiumBookingDelegate(Extras extras, Booking booking) {
        this.extras = extras;
        this.booking = booking;
    }
    public boolean hasTalkback() {
        return true;
    }
    public int extendsPrice() {
        return Math.round(booking.basePrice() + extras.premiumFee);
    }
    public boolean hasDinner(){
        return extras.dinner && !booking.isPeekDay();
    }
}
