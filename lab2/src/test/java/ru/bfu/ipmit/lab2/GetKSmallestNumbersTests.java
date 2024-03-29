package ru.bfu.ipmit.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GetKSmallestNumbersTests {

    @Test
    void shouldReturnKSmallestNumbers() {
        byte[] array = {8, 9, 1, 10};
        int k = 2;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);
        byte[] expectedResult = {1, 8};

        assertArrayEquals(actualResult, expectedResult);

        k = 0;
        actualResult = Lab2.getKSmallestNumbers(array, k);
        expectedResult = new byte[]{};
        assertArrayEquals(actualResult, expectedResult);
    }

}
