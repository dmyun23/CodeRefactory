package chapter01;

import chapter01.vo.Performance;
import chapter01.vo.Play;
import chapter01.vo.PlayType;

public class ComedyPerformanceCalculator extends PerformanceCalculator {
    public ComedyPerformanceCalculator(Performance performance, Play play) {
        super(performance, play);
    }
    @Override
    public int amountFor(){
        int result = 30000;
        if(performance.getAudience() > 20){
            result += 10000 + 500 * ( performance.getAudience() -20);
        }
        result += 300 * performance.getAudience();
        return result;
    }
    @Override
    public int volumeCreditFor(){
        int resulte = 0;
        // 포인트를 적립한다.
        resulte += Math.max(performance.getAudience() -30, 0);
        //희극 관객 5명마다 추가 포인트를 제공한다.
        if( play.getType().equals(PlayType.CODMEDY)){
            resulte += Math.floor(performance.getAudience() /5 );
        }
        return resulte;
    }
}
