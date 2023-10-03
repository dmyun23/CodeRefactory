package chapter06.introduceParameterObject;

import java.util.List;
import java.util.stream.Collectors;

public class After {
    Station station;

    public List<Reading> readingsOutsideRange(Station station, NumberRange numberRange){
        return station.readings
                .stream()
                .filter(r->r.temp < numberRange.getMin() || r.temp > numberRange.getMax())
                .collect(Collectors.toList());
    }
}
