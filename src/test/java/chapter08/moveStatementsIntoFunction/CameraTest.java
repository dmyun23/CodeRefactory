package chapter08.moveStatementsIntoFunction;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CameraTest {

    @Test
    void photoTest(){
        //given
        String title = "한림대학교";
        String location = "강원도";
        LocalDateTime date = LocalDateTime.of(2004, 03,03,9,0);
        Photo photo = new Photo(title,location,date);
        Person person = new Person(photo,"윤동민");
        Camera camera = new Camera();
        //when
        String actualResult1 = camera.renderPerson(person);
        String actualResult2 = camera.photoDiv(person.photo);
        //then
        String result1 = "<p> 윤동민 </p><p> 제목: 한림대학교 </p><p> 위치: 강원도 </p><p> 날짜: 2004-03-03T09:00 </p>";
        String result2 = "<div><p> 제목: 한림대학교 </p><p> 위치: 강원도 </p><p> 날짜: 2004-03-03T09:00 </p></div>";
        assertEquals(result1, actualResult1);
        assertEquals(result2, actualResult2);
    }
}