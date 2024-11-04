package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.Constructor;

public class ConstructorTest {
    @Test
    public void ConstructorTest01(){
        String expected = "The constructor is being called:\n" +
                "The name is Francis";
        String actual = Constructor.Constructor();
        Assertions.assertEquals(expected, actual);
    }
}
