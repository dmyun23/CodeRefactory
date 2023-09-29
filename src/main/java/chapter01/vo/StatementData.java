package chapter01.vo;

import java.util.List;

public class StatementData {
    Invoice invoice;
    Plays plays;

    public StatementData(Invoice invoice, Plays plays) {
        this.invoice = invoice;
        this.plays = plays;
    }

    public String getCustomer(){
        return invoice.getCustomer();
    }
    public List<Performance> getPerformances() {
        return invoice.getPerformances();
    }
    public Invoice getInvoice() {
        return invoice;
    }
    public Play playFor(Performance performance) {
        return plays.get(performance);
    }

    public int amountFor(Performance performance){
        int result = 0;
        switch(playFor(performance).getType()){
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
                throw new Error("알 수 없는 장르: " + playFor(performance).getType());
        }
        return result;
    }

    public int totalVolumeCredits(){
        int result = 0;
        for(Performance performance:invoice.getPerformances()){
            result += volumeCreditFor(plays, performance);
        }
        return result;
    }

    public int totalAmount() throws Exception{
        int totalAmount = 0;
        for(Performance performance: invoice.getPerformances()){
            totalAmount += amountFor(performance);
        }
        return totalAmount/100;
    }

    private int volumeCreditFor(Plays plays, Performance performance){
        int resulte = 0;
        // 포인트를 적립한다.
        resulte += Math.max(performance.getAudience() -30, 0);
        //희극 관객 5명마다 추가 포인트를 제공한다.
        if( playFor(performance).getType().equals(PlayType.CODMEDY)){
            resulte += Math.floor(performance.getAudience() /5 );
        }
        return resulte;
    }

    public Plays getPlays() {
        return plays;
    }
}
