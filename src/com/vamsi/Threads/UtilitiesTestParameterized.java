package com.vamsi.Threads;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    private Utilities utilities;
    private String output;
    private String input;

    public UtilitiesTestParameterized(String output, String input) {
        this.output = output;
        this.input = input;
    }
    @org.junit.Before
    public void setup(){
        utilities = new Utilities();
    }
    @Parameterized.Parameters
    public static Collection<Object> testCondition(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"A", "A"}
        });
    }

    @org.junit.Test
    public void removePairs() throws Exception {
        assertEquals(input,utilities.removePair(output));
    }

}
