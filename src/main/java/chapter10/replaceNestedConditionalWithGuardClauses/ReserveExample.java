package chapter10.replaceNestedConditionalWithGuardClauses;

public class ReserveExample {

    public int adjustedCapital(Instrument instrument) {
        int result = 0;
        if(instrument.capital > 0) {
            if (instrument.interRate > 0 && instrument.duration > 0) {
                result = (int) ((instrument.income / instrument.duration) * instrument.adjustmentFactor);
            }
        }
        return result;
    }
}
