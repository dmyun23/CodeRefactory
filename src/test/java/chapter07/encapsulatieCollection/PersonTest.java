package chapter07.encapsulatieCollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void encapsulateCollectionTest(){
        // given
        List<Course> courseList = new ArrayList<>();
        Person person = new Person("윤동민");
        person.addCourse(new Course("알고리즘", true));
        person.addCourse(new Course("JAVA", false));
        person.addCourse(new Course("REACT", true));
        List<Course> courseList2 = person.getCourses();
        // when
        courseList2.get(0).name = "피아노";
        courseList2.get(0).isAdvanced = false;
        // then
        assertEquals(person.getCourses().get(0).name, "알고리즘");
    }

}