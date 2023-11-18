package chapter10.replaceConditionalWithPolymorphism.example1;

public class Example1 {
    public String plumage(Bird bird){
        switch(bird.getType()) {
            case "유럽 제비":
                return "보통이다";
            case "아프리카 제비":
                return bird.getNumberOfCoconuts() > 2 ? "지쳤다" : "보통이다";
            case "노르웨이 파란 앵무":
                return bird.getVoltage() > 2 ? "지쳤다" : "보통이다";
            default:
                return "알 수 없다";
        }
    }
    public int airSpeedVelocity(Bird bird){
        switch (bird.getType()) {
            case "유럽 제비":
                return 35;
            case "아프리카 제비":
                return 40 - 2 * bird.getNumberOfCoconuts();
            case "노르웨이 파랑 앵무":
                return bird.isNailed() ? 0 : 10 + bird.voltage / 10;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        Bird bird1 = new Bird("아프리카 제비",3,5, false);

        System.out.println(example1.plumage(bird1));
        System.out.println(example1.airSpeedVelocity(bird1));
    }
}
