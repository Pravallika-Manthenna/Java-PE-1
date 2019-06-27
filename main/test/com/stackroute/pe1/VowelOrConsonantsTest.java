package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsonantsTest {
        VowelOrConsonants vowelorconsonants;
@Before
public void setUp(){
        System.out.println("Before");
        vowelorconsonants = new VowelOrConsonants();

        }

@After
public void tearDown(){
        vowelorconsonants = null;
        System.out.println("after");
        }
        @Test
        public void givenStringContainsOneCharShouldReturnVowelMessage(){
        //Arrange
        //Act
        String result = vowelorconsonants.CheckVowelOrConsonants("a" );
        //Assert
        assertEquals("vowel",result);
    }
    @Test
        public void givenStringContainsOneCharShouldReturnConsonantMessage(){
                //Arrange
                //Act
                String result = vowelorconsonants.CheckVowelOrConsonants("s" );
                //Assert
                assertEquals("consonant",result);
        }

        @Test
        public void givenStringContainsOnNumberShouldReturnErrorMessage(){
                //Arrange
                //Act
                String result = vowelorconsonants.CheckVowelOrConsonants("4" );
                //Assert
                assertEquals("Not a character",result);
        }

}