package chapter12.replaceSubclassWithDelegate.multiSubClass;

public class Bird {
    String name;
    String plumage;
    public Bird(Data data) {
        this.name = data.name;
        this.plumage = data.plumage;
    }
    public String getName() {
        return name;
    }
    public String getPlumage() {
        return plumage;
    }
    public int airSpeedVelocity() {
        return 0;
    }
}
