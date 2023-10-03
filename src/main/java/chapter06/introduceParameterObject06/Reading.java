package chapter06.introduceParameterObject06;

import java.time.LocalDateTime;

public class Reading {
    protected int temp;
    protected LocalDateTime time;

    public Reading(int temp, LocalDateTime time) {
        this.temp = temp;
        this.time = time;
    }
}
