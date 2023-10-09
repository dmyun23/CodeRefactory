package chapter08.movsStatementsToCaller;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CameraTest {

    @Test
    void photoTest() throws IOException {
        //given
        String title = "한림대학교";
        String location = "강원도";
        LocalDateTime date = LocalDateTime.of(2004, 03,03,9,0);
        Photo photo = new Photo(title,location,date);
        Person person = new Person(photo,"윤동민");
        Camera camera = new Camera();

        String title2 = "가톨릭대";
        String location2 = "서울";
        LocalDateTime date2 = LocalDateTime.of(2006, 03,03,9,0);
        Photo photo2 = new Photo(title2,location2,date2);
        List<Photo> photoList = new ArrayList<>();
        photoList.add(photo);
        photoList.add(photo2);

        //when
        String actualResult1 = camera.renderPeron(person);
        String actualResult2 = camera.listRecentPhotos(photoList);
        //then

        String result1 = "<p> 윤동민 </p><p> 제목: 한림대학교 </p><p> 위치: 강원도 </p><p> 날짜: 2004-03-03T09:00 </p>";
        String result2 = "<div><p> 제목: 한림대학교 </p><p> 위치: 강원도 </p><p> 날짜: 2004-03-03T09:00 </p></div><div><p> 제목: 가톨릭대 </p><p> 위치: 서울 </p><p> 날짜: 2006-03-03T09:00 </p></div>";
        assertEquals(result1, actualResult1);
        assertEquals(result2, actualResult2);
    }

}