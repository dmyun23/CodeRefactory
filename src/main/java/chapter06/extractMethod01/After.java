package chapter06.extractMethod01;

import java.time.LocalDateTime;

public class After {
    public String pringOwing(Invoice invoice){
        StringBuilder sb = new StringBuilder();
        int outstanding = 0;

        sb.append("*****************");
        sb.append("**** 고객 채무 ****");
        sb.append("*****************");

        // 미해결 채무(outstanding)을 계산한다.
        for(Order o : invoice.getOrders()){
            outstanding += o.amount;
        }

        // 마감일(dueDate)을 기록한다.
        invoice.dueDate = Clock.today();

        // 세부 사항을 출력한다.
        sb.append(String.format("고객명 : %s",invoice.customer));
        sb.append(String.format("채무액 : %d",outstanding));
        sb.append(String.format("마감일 : %s",invoice.dueDate));
        return sb.toString();
    }
}
