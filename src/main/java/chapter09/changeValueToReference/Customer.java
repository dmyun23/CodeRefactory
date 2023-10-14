package chapter09.changeValueToReference;

public class Customer {
    Long id;
    String name;
    int age;

    public Customer() {
    }

    public Customer(Long id) {
        this.id = id;
    }

    public Customer(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
