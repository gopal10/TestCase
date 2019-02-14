package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class ByteArrayTest {


    ByteArray app;

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
        app = new ByteArray();
    }

    @After
    public void tearDown() {
        System.out.println("object destroyed");
        app = null;
    }

    @Test
    public void bytearray() {
        //Arrange
        byte [] expectedValue = {'a', 'b', 'c', 'd'};

        //Act
        byte [] actualValue = app.display();
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }



}