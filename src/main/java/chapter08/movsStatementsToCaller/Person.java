package chapter08.movsStatementsToCaller;

public class Person {
    public Photo photo;
    protected String name;

    public Person(Photo photo, String name) {
        this.photo = photo;
        this.name = name;
    }
    public Photo getPhoto() {
        return photo;
    }
    public String getName() {
        return name;
    }
}
