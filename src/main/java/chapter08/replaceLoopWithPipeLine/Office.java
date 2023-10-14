package chapter08.replaceLoopWithPipeLine;

import java.util.ArrayList;
import java.util.List;

public class Office {
    String city;
    String phone;

    public Office(String city, String phone) {
        this.city = city;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object input){
        Office office = (Office)input;
        if(office ==null ){
            return false;
        }
        if(this.city.equals(office.city)){
            if(this.phone.equals(office.phone)) {
                return true;
            }
        }
        return false;
    }
}
