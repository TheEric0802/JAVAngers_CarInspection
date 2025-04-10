package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarInspectionServiceTest {

    @Test
    void hasFourWheels_shouldReturnFalse_WhenCarHasThreeWheels() {
        assertThat(CarInspectionService.hasFourWheels(new Car(3, 4, true, true))).isFalse();
    }

    @Test
    void hasFourWheels_shouldReturnTrue_WhenCarHasFourWheels() {
        assertThat(CarInspectionService.hasFourWheels(new Car(4, 4, true, true))).isTrue();
    }
}