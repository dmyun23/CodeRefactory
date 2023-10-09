package chapter08.splitLoop;

import java.util.ArrayList;
import java.util.List;

public class Before {
    public static void main(String[] args) {
        List<People> peopleList = getPeopleList(); 
        int youngest = peopleList.isEmpty()?Integer.MAX_VALUE:peopleList.get(0).age;
        int totalSalary=0;
        for(People p:peopleList){
            if(p.age < youngest) youngest = p.age;
            totalSalary += p.salary;
        }
        System.out.println("youngest:"+youngest + ", totalSalary:" +totalSalary);
    }

    private static List<People> getPeopleList() {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People(32,50000000));
        peopleList.add(new People(40,70000000));
        peopleList.add(new People(37,80000000));
        return peopleList;
    }
}
