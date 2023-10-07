package chapter07.encapsulatieCollection;

public class Course implements Cloneable {
    protected String name;
    protected boolean isAdvanced;

    public Course(String name, boolean isAdvanced) {
        this.name = name;
        this.isAdvanced = isAdvanced;
    }

    public String getName(){
        return name;
    }
    public boolean isAdvanced(){
        return isAdvanced;
    }
    public Course clone() throws CloneNotSupportedException {
        return (Course)super.clone();
    }
}
