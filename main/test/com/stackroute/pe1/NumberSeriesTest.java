package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSeriesTest {
    NumberSeries numberseries;
    @Before
    public void setUp() {
        System.out.println("Before");
        numberseries = new NumberSeries();
    }

    @After
    public void tearDown() {
        numberseries=null;
        System.out.println("after");
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
        assertEquals( "error", result);
    }

}