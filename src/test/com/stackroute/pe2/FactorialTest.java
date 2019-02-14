package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial fact;
    @Before
    public void setUp() throws Exception {
        fact=new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        fact=null;
    }

    @Test
    public void factorialOfNumber1() {
        int expected=1;
        int actual=fact.factorialOfNumberTill12(1);
        assertEquals(expected,actual);
    }
    @Test
    public void factorialOfNumber12() {
        int expected=479001600;
        int actual=fact.factorialOfNumberTill12(12);
        assertEquals(expected,actual);
    }




    @Test
    public void longFactorial() {
        long Long_MAX_VALUE=2432902008176640000l;
        long actual=fact.longFactorial(20l);
        assertEquals(Long_MAX_VALUE,actual);


    }

}