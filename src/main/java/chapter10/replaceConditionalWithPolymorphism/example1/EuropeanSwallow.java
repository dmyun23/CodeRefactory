package chapter10.replaceConditionalWithPolymorphism.example1;

public class EuropeanSwallow extends Bird{

    public EuropeanSwallow(Bird bird){
        super(bird.getType(), bird.numberOfCoconuts, bird.voltage,bird.isNailed );
    }
    @Override
    public String plumage(){
        return "보통이다";
    }
    @Override
    public int airSpeedVelocity(){
        return 35;
    }
}
