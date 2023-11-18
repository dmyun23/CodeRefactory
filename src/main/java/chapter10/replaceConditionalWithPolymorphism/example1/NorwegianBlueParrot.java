package chapter10.replaceConditionalWithPolymorphism.example1;

public class NorwegianBlueParrot extends Bird{
    public NorwegianBlueParrot(Bird bird){
        super(bird.getType(), bird.numberOfCoconuts, bird.voltage,bird.isNailed );
    }
    @Override
    public String plumage(){
        return this.getVoltage() > 2 ? "지쳤다" : "보통이다";
    }
    @Override
    public int airSpeedVelocity(){
        return this.isNailed() ? 0 : 10 + this.voltage / 10;
    }
}
