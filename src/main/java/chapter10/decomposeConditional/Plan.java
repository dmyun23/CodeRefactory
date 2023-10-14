package chapter10.decomposeConditional;

import java.time.LocalDateTime;

public class Plan {
    LocalDateTime summerStart;
    LocalDateTime summerEnd;
    double summerRate;
    double regularRate;
    int regularServiceCharge;

    public Plan() {
    }

    public Plan(LocalDateTime summerStart, LocalDateTime summerEnd, double summerRate, double regularRate, int regularServiceCharge) {
        this.summerStart = summerStart;
        this.summerEnd = summerEnd;
        this.summerRate = summerRate;
        this.regularRate = regularRate;
        this.regularServiceCharge = regularServiceCharge;
    }
}
