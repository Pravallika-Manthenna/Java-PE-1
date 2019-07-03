package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTypeTest {
 CharacterType character;
    @Before
    public void setUp(){
        System.out.println("before");
        character = new CharacterType ();
    }

    @After
    public void tearDown(){
        character = null;
     System.out.println("after");

    }
    @Test
    public void givenStringContainsSmallLetterShouldReturnSmallLetterString(){
        //Arrange
        //Act
        String result = character.DisplayType('a' );
        //Assert
        assertEquals("small letter",result);
    }
    @Test
    public void givenStringContainsCapitalLetterShouldReturnCapitalLetterString(){
        //Arrange
        //Act
        String result = character.DisplayType('A' );
        //Assert
        assertEquals("capital letter",result);
    }
    @Test
    public void givenStringContainsDigitShouldReturnDigitString(){
        //Arrange
        //Act
        String result = character.DisplayType('7' );
        //Assert
        assertEquals("digit",result);
    }
    @Test
    public void givenStringContainsSpecialCharacterShouldReturnSpecialCharacterString(){
        //Arrange
        //Act
        String result = character.DisplayType('!' );
        //Assert
        assertEquals("special character",result);
    }

}