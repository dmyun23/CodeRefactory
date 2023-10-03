package chapter06.changeFunctionDeclaration05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfterAddParameterTest {

    @Test
    void addParamterTest(){
        //given
        String name = "윤동민";
        Customer customer = new Customer(name);
        //when
//        BeforeAddParameter beforeAddParameter = new BeforeAddParameter();
//        beforeAddParameter.addReservation(customer);
        AfterAddParameter afterAddParameter = new AfterAddParameter();
        afterAddParameter.addReservation(customer);
        //then
        assertEquals(name, AfterAddParameter.reservation.poll().name);

    }

}