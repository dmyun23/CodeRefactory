package chapter10.replaceConditionalWithPolymorphism.example1;

public class BirdFactory {

    public Bird createBird(Bird bird){
        switch(bird.getType()) {
            case "유럽 제비":
                return new EuropeanSwallow(bird);
            case "아프리카 제비":
                return new AfricanSwallow(bird);
            case "노르웨이 파란 앵무":
                return new NorwegianBlueParrot(bird);
            default:
                return new Bird();
        }
    }

}
