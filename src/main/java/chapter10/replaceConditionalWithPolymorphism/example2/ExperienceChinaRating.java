package chapter10.replaceConditionalWithPolymorphism.example2;

public class ExperienceChinaRating  extends Rating {

    public ExperienceChinaRating(Voyage voyage, History history) {
        super(voyage, history);
    }

    @Override
    public int captainHistoryRisk(Voyage voyage, History history) {
        return super.captainHistoryRisk(voyage, history) -2;
    }

    @Override
    protected int voyageAndHistoryLengthFactor() {
        int result = 3;
        if(history.length() > 10) result += 1;
        if(voyage.length > 12) result += 1;
        if(voyage.length > 18) result -=1;
        return result;
    }

}
