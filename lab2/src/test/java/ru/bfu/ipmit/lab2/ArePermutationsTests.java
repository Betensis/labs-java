package ru.bfu.ipmit.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static  org.junit.jupiter.api.Assertions.assertFalse;

public class ArePermutationsTests {

    @Test
    void shouldReturnTrueIfStringsArePermutations() {
        String firstString = "ab1";
        String secondString = "b1a";

        assertTrue(Lab2.arePermutations(firstString, secondString));

        firstString = "Abc";
        secondString = "abc";
        assertFalse(Lab2.arePermutations(firstString, secondString));

        firstString = "";
        secondString = "";
        assertTrue(Lab2.arePermutations(firstString, secondString));

        firstString = "1 2";
        secondString = "12 ";
        assertTrue(Lab2.arePermutations(firstString, secondString));
    }
}
