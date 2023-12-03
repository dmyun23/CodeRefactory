package chapter12.pullUpConstructBody;

public class Manager extends Employee{
    Grade grade;

    public Manager(String name, Grade grade) {
        super(name);
        this.grade = grade;
        finishedConstruction();
    }
    @Override
    public boolean isPrivileged() {
        return grade.val > 4;
    }
}
