package chapter10.replaceConditionalWithPolymorphism.example1;

public class Example1After {
    BirdFactory birdFactory = new BirdFactory();
    public String plumage(Bird bird){
        return birdFactory.createBird(bird).plumage();
    }
    public int airSpeedVelocity(Bird bird){
        return birdFactory.createBird(bird).airSpeedVelocity();
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        Bird bird1 = new Bird("아프리카 제비",3,5, false);

        System.out.println(example1.plumage(bird1));
        System.out.println(example1.airSpeedVelocity(bird1));
    }
}
