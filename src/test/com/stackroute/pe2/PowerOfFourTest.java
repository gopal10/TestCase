package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class PowerOfFourTest {


    PowerOfFour app;

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
        app = new PowerOfFour();
    }

    @After
    public void tearDown() {
        System.out.println("object destroyed");
        app = null;
    }

    @Test
    public void test1() {
        //Arrange
        boolean expectedValue = true;

        //Act
        boolean actualValue = app.isPowerOfFour(16);
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }

    @Test
    public void test2() {
        //Arrange
        boolean expectedValue = true;

        //Act
        boolean actualValue = app.isPowerOfFour(64);
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }

    @Test
    public void test3() {
        //Arrange
        boolean expectedValue = false;

        //Act
        boolean actualValue = app.isPowerOfFour(5);
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }
}