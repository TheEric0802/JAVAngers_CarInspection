package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Car {

    private int numberOfTires;
    private int numberOfDoors;
    private boolean seatBelt;
    private boolean airbag;
}
