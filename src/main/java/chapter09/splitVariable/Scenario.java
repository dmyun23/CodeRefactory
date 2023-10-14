package chapter09.splitVariable;

public class Scenario {
    int primaryForce;
    int delay;
    int secondaryForce;
    int mass;

    public Scenario() {
    }
    public Scenario(int primaryForce, int delay, int secondaryForce, int mass) {
        this.primaryForce = primaryForce;
        this.delay = delay;
        this.secondaryForce = secondaryForce;
        this.mass = mass;
    }
}
