package chapter07.encapsulatieCollection;

import java.util.ArrayList;
import java.util.List;

public class Person {
    protected String name;
    protected List<Course> courses = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public List<Course> getCourses() {
        return coursesClone(courses);
    }

    private List<Course> coursesClone(List<Course> courses)  {
        List<Course> temp = new ArrayList<>();
        for(int i=0; i< courses.size(); i++){
            try{
                temp.add(courses.get(i).clone());
            }catch(  CloneNotSupportedException e ){
                e.printStackTrace();
            }
        }
        return temp;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }
    public void removeCourse(Course course){
        this.courses.remove(course);
    }
    public void removeCourse(int index){
        try{
            this.courses.remove(index);
        }catch(IndexOutOfBoundsException e){
            throw e;
        }
    }
}
