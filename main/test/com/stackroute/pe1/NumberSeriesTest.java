package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSeriesTest {
    NumberSeries numberseries;
    @Before
    public void setUp() {

        numberseries = new NumberSeries();
    }

    @After
    public void tearDown() {
        numberseries=null;

    }
    @Test
    public void givenStringContainsNumbersShouldReturnNumberSeries(){
        //Arrange
        //Act
        String result = numberseries.IterationNumbers(3);
        //Assert
        assertEquals( "122333", result);
    }
    @Test
    public void givenStringContainsNumberShouldReturnErrorMessage(){
        //Arrange
        //Act
        String result = numberseries.IterationNumbers(0);
        //Assert
        assertEquals( "Cannot be Less than 1", result);
    }
    @Test
    public void givenStringContainsNegativeNumberShouldReturnNegativeMessage(){
        //Arrange
        //Act
        String result = numberseries.IterationNumbers(-3);
        //Assert
        assertEquals( "Negative numbers are not allowed", result);
    }

}