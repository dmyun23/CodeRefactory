package chapter08.moveStatementsIntoFunction;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;

public class Camera {

    public String renderPerson(Person person){
        StringBuilder result = new StringBuilder();
        result.append(String.format("<p> %s </p>", person.name));
//        result.append(String.format("<p> 제목: %s </p>", person.photo.title));
        result.append(emitPhotoData(person.photo));
        return result.toString();
    }

    public String photoDiv(Photo photo) {
        StringBuilder result = new StringBuilder();
        result.append("<div>");
//        result.append(String.format("<p> 제목: %s </p>", photo.title));
        result.append(emitPhotoData(photo));
        result.append("</div>");
        return result.toString();
    }
//    private String emitPhotoData(Photo photo) {
//        StringBuilder result = new StringBuilder();
//        result.append(String.format("<p> 위치: %s </p>", photo.location));
//        result.append(String.format("<p> 날짜: %s </p>", photo.date.toString()));
//        return result.toString();
//    }
    private String emitPhotoData(Photo photo){
        StringBuilder result = new StringBuilder();
        result.append(String.format("<p> 제목: %s </p>", photo.title));
        result.append(String.format("<p> 위치: %s </p>", photo.location));
        result.append(String.format("<p> 날짜: %s </p>", photo.date.toString()));
        return result.toString();
    }
}
