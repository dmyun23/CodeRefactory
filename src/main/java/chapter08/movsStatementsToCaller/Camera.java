package chapter08.movsStatementsToCaller;

import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Camera {
    public String renderPeron(Person person) throws IOException {
        StringBuilder result = new StringBuilder();
        result.append(String.format("<p> %s </p>", person.name));
        result.append(emitPhotoData(person.photo));
        result.append(String.format("<p> 날짜: %s </p>", person.photo.date.toString()));
        return result.toString();
    }
    public String listRecentPhotos(List<Photo> photos) {
        StringBuilder result = new StringBuilder();
        photos.stream()
                .filter(p -> p.date.isAfter(recentDateCutOff()))
                .forEach(p -> {
                    try {
                        result.append("<div>");
                        result.append(emitPhotoData(p));
                        result.append(String.format("<p> 날짜: %s </p>", p.date.toString()));
                        result.append("</div>");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        return result.toString();
    }

//    public String emitPhotoData(Photo photo) throws IOException {
//        StringBuilder result = new StringBuilder();
//        result.append(zzNew(photo));
//        result.append(String.format("<p> 날짜: %s </p>", photo.date.toString()));
//        return result.toString();
//    }
    private LocalDateTime recentDateCutOff() {
        return LocalDateTime.of(2003, 03,03,9,0);
    }
    private String emitPhotoData(Photo photo) throws IOException {
        StringBuilder result = new StringBuilder();
        result.append(String.format("<p> 제목: %s </p>", photo.title));
        result.append(String.format("<p> 위치: %s </p>", photo.location));
        return result.toString();
    }

//    public static void main(String[] args) throws IOException {
//        String title = "한림대학교";
//        String location = "강원도";
//        LocalDateTime date = LocalDateTime.of(2004, 03,03,9,0);
//        Photo photo = new Photo(title,location,date);
//        Person person = new Person(photo,"윤동민");
//        Camera camera = new Camera();
//        String actualResult1 = camera.renderPeron(person);
//        System.out.println(actualResult1);
//
//        String title2 = "가톨릭대";
//        String location2 = "서울";
//        LocalDateTime date2 = LocalDateTime.of(2006, 03,03,9,0);
//        Photo photo2 = new Photo(title2,location2,date2);
//        List<Photo> photoList = new ArrayList<>();
//        photoList.add(photo);
//        photoList.add(photo2);
//        String actualResult2 = camera.listRecentPhotos(photoList);
//        System.out.println(actualResult2);
//    }
}
