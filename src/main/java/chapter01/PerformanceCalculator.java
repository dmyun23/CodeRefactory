package chapter01;

import chapter01.vo.Performance;
import chapter01.vo.Play;
import chapter01.vo.PlayType;
import chapter01.vo.Plays;

public class PerformanceCalculator {
    Performance performance;
    Play play;

    public PerformanceCalculator(Performance performance, Play play) {
        this.performance = performance;
        this.play = play;
    }

    public int amountFor(){
        int result = 0;
        switch(play.getType()){
            case TRAGEDY : // 비극
                result = 40000;
                if(performance.getAudience()>30){
                    result += 1000 * (performance.getAudience() - 30);
                }
                break;
            case CODMEDY : //희극
                result = 30000;
                if(performance.getAudience() > 20){
                    result += 10000 + 500 * ( performance.getAudience() -20);
                }
                result += 300 * performance.getAudience();
                break;
            default:
                throw new Error("알 수 없는 장르: " + play.getType());
        }
        return result;
    }

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
