package com.stackroute.pe1;

import java.util.Scanner;
// program to find the character type
public class CharacterType {

        public String DisplayType(char character){
            String result;
            //if it is small letter
        if(character >= 'a' && character <= 'z')
        {
            result = "small letter";
        }
        // if it is capital letter
        else if(character >= 'A' && character <= 'Z')
        {
            result = "capital letter";
        }
        // if it is digit
        else if(character >= '0' && character <= '9')
        {
            result = "digit";
        }
        // if it is a special character
        else
        {
            result = "special character";
        }
            return result;
    }

}
