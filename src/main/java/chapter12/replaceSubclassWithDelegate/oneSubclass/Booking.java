package chapter12.replaceSubclassWithDelegate.oneSubclass;

import java.time.LocalDateTime;

public class Booking {
    Show show;
    LocalDateTime date;
    PremiumBookingDelegate premiumBooking;

    public Booking(Show show, LocalDateTime date) {
        this.show = show;
        this.date = date;
    }
    public boolean hasTalkback(){
        return show.talkback && isPeekDay();
    }
    protected boolean isPeekDay() {
        return false;
    }
    public int basePrice(){
        int result = show.price;
        if(isPeekDay()) result += Math.round(result*0.15);
        return result;
    }
    public PremiumBookingDelegate bePremium(Extras extras){
        premiumBooking = new PremiumBookingDelegate( extras, this);
        return premiumBooking;
    }
}
