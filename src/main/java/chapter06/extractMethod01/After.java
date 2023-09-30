package chapter06.extractMethod01;

import java.time.LocalDateTime;

public class After {
    public String pringOwing(Invoice invoice){
        StringBuilder sb = new StringBuilder();

        printBanner(sb);
        int outstanding = calculateOutStanding(invoice);
        recordDueDate(invoice);
        printDetail(sb,invoice,outstanding);

        return sb.toString();
    }

    private void printBanner(StringBuilder result) {
        result.append("*****************");
        result.append("**** 고객 채무 ****");
        result.append("*****************");
    }
    // 미해결 채무(outstanding)을 계산한다.
    private int calculateOutStanding(Invoice invoice){
        int result = 0;

        for(Order o : invoice.getOrders()){
            result += o.amount;
        }
        return result;
    }
    // 마감일(dueDate)을 기록한다.
    private void recordDueDate(Invoice invoice){
        invoice.dueDate = Clock.today();
    }
    // 세부 사항을 출력한다.
    private void printDetail(StringBuilder result,Invoice invoice, int outstanding){
        result.append(String.format("고객명 : %s",invoice.customer));
        result.append(String.format("채무액 : %d",outstanding));
        result.append(String.format("마감일 : %s",invoice.dueDate));
    }
}
