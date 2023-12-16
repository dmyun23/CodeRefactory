package chapter12.replaceSubclassWithDelegate.oneSubclass;

import java.time.LocalDateTime;

public class Client {
    public void example(Show show, LocalDateTime date){
        Booking bookeing = createBooking(show, date);
    }
    public void example2(Show show, LocalDateTime date, Extras extras){
        PremiumBookingDelegate preminumBooking = createPreminumBooking(show, date, extras);
    }
    private Booking createBooking(Show show, LocalDateTime date){
        return new Booking(show,date);
    }
    private PremiumBookingDelegate createPreminumBooking(Show show, LocalDateTime date, Extras extras){
        return createBooking(show,date).bePremium(extras);
    }
}
