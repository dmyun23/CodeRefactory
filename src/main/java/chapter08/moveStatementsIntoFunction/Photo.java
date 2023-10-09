package chapter08.moveStatementsIntoFunction;

import chapter07.replacePrimitiveWithObject.Priority;

import java.time.LocalDateTime;

public class Photo {
    public String title;
    public String location;
    public LocalDateTime date;

    public Photo(String title, String location, LocalDateTime date) {
        this.title = title;
        this.location = location;
        this.date = date;
    }
}
