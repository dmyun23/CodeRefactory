package chapter01;

import chapter01.vo.Performance;
import chapter01.vo.Play;
import chapter01.vo.PlayType;

public class TragedyPeformanaceCalculator extends PerformanceCalculator {
    public TragedyPeformanaceCalculator(Performance performance, Play play) {
        super(performance, play);
    }
    @Override
    public int amountFor(){
        int result = 40000;
        if(performance.getAudience()>30){
            result += 1000 * (performance.getAudience() - 30);
        }
        return result;
    }
    @Override
    public int volumeCreditFor(){
        int resulte = 0;
        // 포인트를 적립한다.
        resulte += Math.max(performance.getAudience() -30, 0);
        return resulte;
    }

}
