package chapter10.replaceConditionalWithPolymorphism.example1;

public class Bird {
    String type;
    int numberOfCoconuts;
    int voltage;
    boolean isNailed;

    public String getType() {
        return type;
    }

    public int getNumberOfCoconuts() {
        return numberOfCoconuts;
    }

    public int getVoltage() {
        return voltage;
    }
    public boolean isNailed() {
        return isNailed;
    }

    public Bird() {
    }
    public Bird(String type, int numberOfCoconuts, int voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public String plumage(){
         return "알 수 없다";
    }
    public int airSpeedVelocity(){
        return 0;
    }
}
