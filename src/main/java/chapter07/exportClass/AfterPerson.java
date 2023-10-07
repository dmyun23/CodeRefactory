package chapter07.exportClass;

public class AfterPerson {
    protected String name;

    TelephoneNumber telephoneNumber;

    public AfterPerson() {
        this.telephoneNumber = new TelephoneNumber();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOfficeAreaCode() {
        return this.telephoneNumber.areaCode;
    }
    public void setOfficeAreaCode(String areaCode) {
        this.telephoneNumber.areaCode = areaCode;
    }
    public String getOfficeNumber() {
        return this.telephoneNumber.number;
    }
    public void setOfficeNumber(String officeNumber) {
        this.telephoneNumber.number = officeNumber;
    }
}
