package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();


    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineA.csv", numLinesToSkip = 1)
    public void shouldGenerateComputersNumbers(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> integers = new HashSet<>();
        integers.add(one);
        integers.add(two);
        integers.add(three);
        integers.add(four);
        integers.add(five);
        integers.add(six);

        int l = gamblingMachine.howManyWins(integers);
        assertTrue(l >= 0 && l <= 6);
    }

}