package chapter06.extractMethod01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    public static String today(){
        return LocalDateTime.now().plusDays(30).format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }
}
