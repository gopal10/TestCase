package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class MinMaxAvgTest {

    MinMaxAvg app;

    @BeforeClass
    public static void setUpOnce() {
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce() {
        System.out.println("Inside teardown once");

    }

    @Before
    public void setUp() {
        System.out.println("object created");
        app = new MinMaxAvg();
    }

    @After
    public void tearDown() {
        System.out.println("object destroyed");
        app = null;
    }

    @Test
    public void minmax() {
        //Arrange
        int []  expectedValue = {81,65,98};
          int a []={86,65,98,66};
        //Act
        int [] actualValue = app.dispMinMaxAvg(a,4);
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }



}
