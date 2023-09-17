package chapter01;

import chapter01.vo.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Statement {
    public String statement(Invoice invoice, Plays plays){

        int totalAmount = 0;
        int volumeCredits = 0;
        String result = String.format("청구내역 (고객명: %s)\n", invoice.getCustomer());
        for(Performance perf:invoice.getPerformances()){
            Play play = plays.get(perf);
            int thisAmount = 0;

            switch(play.getType()){
                case TRAGEDY : // 비극
                    thisAmount = 40000;
                    if(perf.getAudience()>30){
                        thisAmount += 1000 * (perf.getAudience() - 30);
                    }
                    break;
                case CODMEDY : //희극
                    thisAmount = 30000;
                    if(perf.getAudience() > 20){
                        thisAmount += 10000 + 500 * ( perf.getAudience() -20);
                    }
                    thisAmount += 300 * perf.getAudience();
                    break;
                default:
                    throw new Error("알 수 없는 장르: " + play.getType());
            }
            // 포인트를 적립한다.
            volumeCredits += Math.max(perf.getAudience() -30, 0);
            //희극 관객 5명마다 추가 포인트를 제공한다.
            if(PlayType.CODMEDY == play.getType()){
                volumeCredits += Math.floor(perf.getAudience() /5 );
            }
            //청구 내역을 출력한다.
            result += String.format("%s: $%d %d석\n", play.getName(),Math.round(thisAmount/100),perf.getAudience() );
            totalAmount += thisAmount;
        }
        result += String.format("총액: $%d\n", Math.round(totalAmount/100));
        result += String.format("적립 포인트: %d점", volumeCredits);
        System.out.println("결과 : "+ result);
        return result;
    }
}
