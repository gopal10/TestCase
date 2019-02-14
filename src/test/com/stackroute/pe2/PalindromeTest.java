package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {

        Palindrome app;

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
            app = new Palindrome();
        }

        @After
        public void tearDown() {
            System.out.println("object destroyed");
            app = null;
        }

        @Test
        public void FirstPalindromeSuccess() {
            //Arrange
            boolean expectedValue = true;

            //Act
            boolean actualValue = app.isPalindrome("madam");
            //Assert
            assertEquals(expectedValue, actualValue);

            assertNotNull(actualValue);

        }

        @Test
        public void SecondPalindromeSuccess() {
            //Arrange
            boolean expectedValue = true;

            //Act
            boolean actualValue = app.isPalindrome("123454321");
            //Assert
            assertEquals(expectedValue, actualValue);

            assertNotNull(actualValue);

        }

        @Test
        public void firstPalindromeFailure() {
            //Arrange
            boolean expectedValue = false;

            //Act
            boolean actualValue = app.isPalindrome("1232");
            //Assert
            assertEquals(expectedValue, actualValue);

            assertNotNull(actualValue);

        }

    @Test
    public void secondPalindromeFailure() {
        //Arrange
        boolean expectedValue = false;

        //Act
        boolean actualValue = app.isPalindrome(" ");
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }


    }