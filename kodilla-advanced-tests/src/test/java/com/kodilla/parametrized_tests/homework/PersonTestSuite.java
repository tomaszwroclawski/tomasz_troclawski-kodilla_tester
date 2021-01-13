package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "providePersonInfoForTestBMI")
    public void shouldReturnPropertyInfoAccToBMI(double heightInMeters, double weightInKilograms, String expectedInfo) {
        Person person = new Person(heightInMeters, weightInKilograms);
        assertEquals(expectedInfo, person.getBMI());
    }

    private static Stream<Arguments> providePersonInfoForTestBMI() {
        return Stream.of(
                Arguments.of(1.90, 40, "Very severely underweight"),
                Arguments.of(1.70, 45, "Severely underweight"),
                Arguments.of(1.75, 52, "Underweight"),
                Arguments.of(1.76, 61, "Normal (healthy weight)"),
                Arguments.of(1.79, 84, "Overweight"),
                Arguments.of(1.77, 95, "Obese Class I (Moderately obese)"),
                Arguments.of(1.83, 118, "Obese Class II (Severely obese)"),
                Arguments.of(1.75, 128, "Obese Class III (Very severely obese)"),
                Arguments.of(1.68, 132, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.69, 148, "Obese Class V (Super Obese)"),
                Arguments.of(1.70, 190, "Obese Class VI (Hyper Obese)")
        );
    }
}