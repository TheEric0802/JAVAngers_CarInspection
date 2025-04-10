package org.example;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CarInspectionService {
    boolean hasFourWheels(Car car) {
        return car.getNumberOfTires() == 4;
    }

    boolean hasSeatBelt(Car car) {
        return car.isSeatBelt();
    }
}
