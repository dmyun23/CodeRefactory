package chapter10.replaceNestedConditionalWithGuardClauses;

public class AfterReserveExample {
    public int adjustedCapital(Instrument instrument) {
        int result = 0;
        if( instrument.capital <= 0 ||
            instrument.interRate <=0 ||
            instrument.duration <= 0
        ) return 0;
        return (int) ((instrument.income / instrument.duration) * instrument.adjustmentFactor);
    }
}
