package chapter08.replaceLoopWithPipeLine;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainAfterTest {

    @Test
    void acquireDataTest(){
        //given
        StringBuilder sb = new StringBuilder();
        sb.append("office, country, telephone");
        sb.append(System.lineSeparator());
        sb.append("Chicago, USA,+1 312 373 1000");
        sb.append(System.lineSeparator());
        sb.append("Beijing, China,+86 4008 900 505");
        sb.append(System.lineSeparator());
        sb.append("Bangalor, India,+91 80 4064 9570");
        sb.append(System.lineSeparator());
        sb.append("Porto Alegre, Brazil,+55 51 3079 3550");
        sb.append(System.lineSeparator());
        sb.append("Cennai,India,+91 44 660 44766");
        List<Office> result = new ArrayList<>();
        result.add(new Office("Bangalor","+91 80 4064 9570"));
        result.add(new Office("Cennai","+91 44 660 44766"));
        // when
        List<Office> actualResult = MainAfter.acquireData(sb.toString());

        int i = 0;
        //then
        for(Office office:actualResult){
            assertEquals(true,result.get(i).equals(office));
            i++;
        }
    }

}