package chapter12.replaceTypeCodeWithSubclasses.indirect;

public class EmployeeType {

    String value;

    public EmployeeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
