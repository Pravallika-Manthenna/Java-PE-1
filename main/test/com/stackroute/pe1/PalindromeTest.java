package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp()  {
        System.out.println("Before");
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() {
        palindrome = null;
        System.out.println("after");
    }
    @Test
    public void givenStringContainsStringShouldReturnPalindromeString(){
        //Arrange
        //Act
        String result = palindrome.DisplayPalindrome(121);
        //Assert
        assertEquals("121 is palindrome and sum of even numbers is lesser than 25" ,result);
    }
    @Test
    public void givenStringContainsGreaterStringShouldReturnPalindromeString(){
        //Arrange
        //Act
        String result = palindrome.DisplayPalindrome(6789876);
        //Assert
        assertEquals("6789876 is palindrome and sum of even numbers is greater than 25" ,result);
    }
    @Test
    public void givenStringContainsNotPalindromeShouldReturnNotPalindromeString(){
        //Arrange
        //Act
        String result = palindrome.DisplayPalindrome(123);
        //Assert
        assertEquals("Not a palindrome" ,result);
    }


}