package chapter12.removeSubClass;

import java.util.List;
import java.util.stream.Collectors;

public class Client {

    public List<Person> laodFromInput(List<Data> dataList){
        return dataList.stream()
                .map(this::createPerson)
                .collect(Collectors.toList());
    }
    private Person createPerson(Data d){
        Person p;
        switch (d.gender){
            case "W": p = new Person(d.name, "M"); break;
            case "M": p = new Person(d.name, "M"); break;
            default: p = new Person(d.name);
        }
        return p;
    }
}
