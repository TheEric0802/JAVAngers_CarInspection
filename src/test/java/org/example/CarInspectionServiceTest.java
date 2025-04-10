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

    @Test
    void hasSeatBelt_shouldReturnFalse_WhenCarHasNoSeatBelt() {
        assertThat(CarInspectionService.hasSeatBelt(new Car(4, 4, false, true))).isFalse();
    }

    @Test
    void hasSeatBelt_shouldReturnTrue_WhenCarHasSeatBelt() {
        assertThat(CarInspectionService.hasSeatBelt(new Car(4, 4, true, true))).isTrue();
    }

    @Test
    void hasAirbag_shouldReturnFalse_WhenCarHasNoAirbag() {
        assertThat(CarInspectionService.hasAirbag(new Car(4, 4, true, false))).isFalse();
    }

    @Test
    void hasAirbag_shouldReturnTrue_WhenCarHasAirbag() {
        assertThat(CarInspectionService.hasAirbag(new Car(4, 4, true, true))).isTrue();
    }

    @Test
    void hasThreeOrFiveDoors_shouldReturnTrue_WhenCarHasThreeDoors() {
        assertThat(CarInspectionService.hasThreeOrFiveDoors(new Car(4, 3, true, true))).isTrue();
    }

    @Test
    void hasThreeOrFiveDoors_shouldReturnTrue_WhenCarHasFiveDoors() {
        assertThat(CarInspectionService.hasThreeOrFiveDoors(new Car(4, 5, true, true))).isTrue();
    }

    @Test
    void hasThreeOrFiveDoors_shouldReturnFalse_WhenCarHasFourDoors() {
        assertThat(CarInspectionService.hasThreeOrFiveDoors(new Car(4, 4, true, true))).isFalse();
    }
}