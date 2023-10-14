package chapter08.replaceLoopWithPipeLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainAfter {
    public static List<Office> acquireData(String input){
        String[] lines = input.split(System.lineSeparator());
        String[] loop = lines;
        List<Office> result = new ArrayList<>();
        Arrays.stream(lines)
                .skip(1)
                .filter(line->!line.trim().equals(""))
                .map(line->line.split(","))
                .filter(field->field[1].trim().equals("India"))
                .forEach(field->result.add(new Office(field[0],field[2])));
                ;
        return result;
    }
}
