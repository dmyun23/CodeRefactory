package chapter08.splitLoop;

import java.util.ArrayList;
import java.util.List;

public class After {
    public static void main(String[] args) {
        List<People> peopleList = getPeopleList();
        System.out.println("youngest:"+getYoungest(peopleList) + ", totalSalary:" +getTotalSalary(peopleList));
    }
    private static int getYoungest(List<People> peopleList){
        int youngest = peopleList.isEmpty()?Integer.MAX_VALUE:peopleList.get(0).age;
        for(People p:peopleList){
            if(p.age < youngest) youngest = p.age;
        }
        return youngest;
    }
    private static int getTotalSalary(List<People> peopleList){
        int totalSalary=0;
        for(People p:peopleList){
            totalSalary += p.salary;
        }
        return totalSalary;
    }
    private static List<People> getPeopleList() {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People(32,50000000));
        peopleList.add(new People(40,70000000));
        peopleList.add(new People(37,80000000));
        return peopleList;
    }
}
