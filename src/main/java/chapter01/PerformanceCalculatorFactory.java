package chapter01;

import chapter01.vo.Performance;
import chapter01.vo.Play;

public class PerformanceCalculatorFactory {
    public PerformanceCalculator createPerformanceCalculator(Performance performance, Play play){
        int result = 0;
        switch(play.getType()){
            case TRAGEDY : // 비극
                return new TragedyPeformanaceCalculator(performance, play);
            case CODMEDY : //희극
                return new ComedyPerformanceCalculator(performance, play);
            default:
                throw new Error("알 수 없는 장르: " + play.getType());
        }
    }
}
