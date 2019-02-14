package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckFrequencyTest {
    CheckFrequency app;

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
        app = new CheckFrequency();
    }

    @After
    public void tearDown() {
        System.out.println("object destroyed");
        app = null;
    }

    @Test
    public void file() {
        //Arrange
        int expectedValue = 8;

        //Act
        int actualValue = app.words();
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }
}