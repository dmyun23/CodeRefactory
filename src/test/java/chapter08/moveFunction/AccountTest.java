package chapter08.moveFunction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void overdraftChargeTest(){
        // given
        int daysOverdrawn = 8;
        AccountType type = new AccountType(true);
        Account account = new Account(daysOverdrawn, type);
        // when
        double actualRestul = account.bankCharge();
        // then
        double result = 13.0;
        assertEquals(result, actualRestul);
    }

}