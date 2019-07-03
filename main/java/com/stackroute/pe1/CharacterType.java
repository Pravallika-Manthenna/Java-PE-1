package com.stackroute.pe1;

import java.util.Scanner;

public class CharacterType {

        public String DisplayType(char character){
            String result;
        if(character >= 'a' && character <= 'z')
        {
            result = "small letter";
        }
        else if(character >= 'A' && character <= 'Z')
        {
            result = "capital letter";
        }
        else if(character >= '0' && character <= '9')
        {
            result = "digit";
        }
        else
        {
            result = "special character";
        }
            return result;
    }

}
