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

    boolean hasAirbag(Car car) {
        return car.isAirbag();
    }

    boolean hasThreeOrFiveDoors(Car car) {
        int doors = car.getNumberOfDoors();
        return doors == 3 || doors == 5;
    }

    boolean checkCar(Car car) {
        return hasFourWheels(car) && hasSeatBelt(car) && hasAirbag(car) && hasThreeOrFiveDoors(car);
    }
}
