package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringreverse;
    @Before
    public void setUp() {

        stringreverse = new StringReverse();

    }

    @After
    public void tearDown() {
        stringreverse = null;

    }
    @Test
        public void givenStringContainsStringShouldReturnReverseString(){
            //Arrange
            //Act
            String reverse = stringreverse.ReverseString("stack" );
            //Assert
            assertEquals("kcats",reverse);
        }
    @Test
    public void givenStringContainsNullShouldReturnNullMessage(){
        //Arrange
        //Act
        String reverse = stringreverse.ReverseString(" " );
        //Assert
        assertEquals("Null not allowed", reverse);
    }
    @Test
    public void givenStringContainsNumberShouldReturnReverseString(){
        //Arrange
        //Act
        String reverse = stringreverse.ReverseString("123" );
        //Assert
        assertEquals("321", reverse);
    }
}

