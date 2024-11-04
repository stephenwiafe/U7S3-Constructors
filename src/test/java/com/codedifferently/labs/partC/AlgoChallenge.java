package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoChallenge {
    // Problem 22
    @Test
    public void doubleTheSumTest01() {

        // Given
        int a = 1;
        int b = 2;

        // When
        Integer expected = 3;
        Integer actual = partC.AlgoChallenge.doubleTheSum(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doubleTheSumTest02() {

        // Given
        int a = 3;
        int b = 2;

        // When
        Integer expected = 5;
        Integer actual = partC.AlgoChallenge.doubleTheSum(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doubleTheSumTest03() {

        // Given
        int a = 2;
        int b = 2;

        // When
        Integer expected = 8;
        Integer actual = partC.AlgoChallenge.doubleTheSum(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    // Problem 23
    @Test
    public void lookOut10Test01() {

        // Given
        int a = 9;
        int b = 10;

        // When
        Boolean expected = true;
        Boolean actual = partC.AlgoChallenge.lookOut10(a,b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lookOut10Test02() {

        // Given
        int a = 9;
        int b = 9;

        // When
        Boolean expected = false;
        Boolean actual = partC.AlgoChallenge.lookOut10(a,b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lookOut10Test03() {

        // Given
        int a = 1;
        int b = 9;

        // When
        Boolean expected = true;
        Boolean actual = partC.AlgoChallenge.lookOut10(a,b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

}
