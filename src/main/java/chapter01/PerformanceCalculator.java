package chapter01;

import chapter01.vo.Performance;
import chapter01.vo.Play;
import chapter01.vo.PlayType;
import chapter01.vo.Plays;

public abstract class PerformanceCalculator {
    Performance performance;
    Play play;

    public PerformanceCalculator(Performance performance, Play play) {
        this.performance = performance;
        this.play = play;
    }

    abstract public int amountFor();

    abstract public int volumeCreditFor();
}
