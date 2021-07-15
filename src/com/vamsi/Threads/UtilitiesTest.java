package com.vamsi.Threads;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities utilities;
    @org.junit.Before
    public void setup(){
        utilities = new Utilities();
    }

    @org.junit.Test
    public void veryNthChar() {
        char[] result = {'h','e','l','l','o'};
        char[] rs=utilities.veryNthChar(result,2);
        char[] res = {'e','l'};
        assertArrayEquals(res,rs);
        char[] output = utilities.veryNthChar(new char[] {'h','e','l','l','o'},8);
        assertArrayEquals(new char[]{'h','e','l','l','o'},output);

    }

    @org.junit.Test
    public void removePair() {
        String result = utilities.removePair("AABCDDEFF");
        assertEquals("ABCDEF","ABCDEF",result);
        String result1 = utilities.removePair("ABCCABDEEF");
        assertEquals("","ABCABDEF",result1);
        assertNull(utilities.removePair(null));
        assertEquals("Q",utilities.removePair("Q"));


    }

    @org.junit.Test
    public void converter() {
        assertEquals(300,utilities.converter(10,5));
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(utilities.nullIfOddLength("odd"));
        assertNotNull(utilities.nullIfOddLength("even"));
    }
}