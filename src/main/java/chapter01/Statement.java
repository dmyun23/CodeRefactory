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
        StringBuilder result = new StringBuilder(String.format("청구내역 (고객명: %s)\n", invoice.getCustomer()));
        for(Performance performance:invoice.getPerformances()){
            //청구 내역을 출력한다.
            result.append(String.format("%s: $%d %d석\n",
                            playFor(plays,performance).getName(),amountFor(performance, plays)/100,performance.getAudience()
                        ));
            totalAmount += amountFor(performance, plays);;
        }
        result.append(String.format("총액: $%d\n", totalAmount/100));
        result.append(String.format("적립 포인트: %d점", totalVolumeCredits(invoice, plays)));
        return result.toString();
    }

    private int amountFor(Performance performance, Plays plays){
        int result = 0;
        switch(playFor(plays,performance).getType()){
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
                throw new Error("알 수 없는 장르: " + playFor(plays,performance).getType());
        }
        return result;
    }
    private Play playFor(Plays plays, Performance Performance) {
        return plays.get(Performance);
    }
    private int volumeCreditFor(Plays plays, Performance performance){
        int resulte = 0;
        // 포인트를 적립한다.
        resulte += Math.max(performance.getAudience() -30, 0);
        //희극 관객 5명마다 추가 포인트를 제공한다.
        if( playFor(plays,performance).getType().equals(PlayType.CODMEDY)){
            resulte += Math.floor(performance.getAudience() /5 );
        }
        return resulte;
    }
    private int totalVolumeCredits(Invoice invoice, Plays plays){
        int result = 0;
        for(Performance performance:invoice.getPerformances()){
            result += volumeCreditFor(plays, performance);
        }
        return result;
    }
}
