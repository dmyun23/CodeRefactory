package chapter12.replaceSubclassWithDelegate.oneSubclass;

import java.time.LocalDateTime;

public class PremiumBooking extends Booking {
    Extras extras;

    public PremiumBooking(Show show, LocalDateTime date, Extras extras) {
        super(show, date);
        this.extras = extras;
    }
    @Override
    public boolean hasTalkback() {
        return true;
    }
    @Override
    public int basePrice() {
        return Math.round(super.basePrice() + extras.premiumFee);
    }
    public boolean hasDinner(){
        return extras.dinner && !isPeekDay();
    }
}
