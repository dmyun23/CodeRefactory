package chapter11.separteQueryFromModifier;

import java.util.ArrayList;
import java.util.List;

public class Example {
    List<Person> people = new ArrayList<>();

    public void alertMiscreant() {
        findMiscreant();
        setOffAlarms();
    }

    public String findMiscreant() {
        for(Person p : people){
            if(p.name.equals("조커")){
                return "조커";
            }
            if(p.name.equals("샤루만")){
                return "샤루만";
            }
        }
        return "";
    }
    private void setOffAlarms() {
    }

    public static void main(String[] args) {

    }
}
