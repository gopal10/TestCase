package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    EvenNumTest even;
    @Before
    public void setUp() throws Exception {
        even = new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        even = null;
    }

    @Test
    public void isEvenSuccess() {
        assertEquals(true,EvenNumTest.isEven(10));
        assertNotNull(EvenNumTest.isEven(10));
    }

    @Test
    public void isEvenFailure() {
        assertEquals(false,EvenNumTest.isEven(9));
        assertNotNull(EvenNumTest.isEven(9));
    }

    @Test
    public void isEven() {
        assertEquals(false,EvenNumTest.isEven(0));
        assertNotNull(EvenNumTest.isEven(0));
    }


}