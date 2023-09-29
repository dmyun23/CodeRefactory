package chapter01.vo;

import chapter01.PerformanceCalculator;
import chapter01.PerformanceCalculatorFactory;

import java.util.List;

public class StatementData {
    Invoice invoice;
    Plays plays;
    PerformanceCalculatorFactory performanceCalculatorFactory;

    public StatementData(Invoice invoice, Plays plays,PerformanceCalculatorFactory performanceCalculatorFactory) {
        this.invoice = invoice;
        this.plays = plays;
        this.performanceCalculatorFactory = performanceCalculatorFactory;
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
    public int totalVolumeCredits(){
        int result = 0;
        for(Performance performance:invoice.getPerformances()){
            result += volumeCreditFor(performance);
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

    private int volumeCreditFor(Performance performance){
          return performanceCalculatorFactory.createPerformanceCalculator(performance, playFor(performance)).volumeCreditFor();
    }
    public Plays getPlays() {
        return plays;
    }
    public int amountFor(Performance performance) throws Exception {
        return performanceCalculatorFactory.createPerformanceCalculator(performance, playFor(performance)).amountFor();
    }
}
