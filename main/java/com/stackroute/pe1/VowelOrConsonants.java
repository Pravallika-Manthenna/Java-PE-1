package com.stackroute.pe1;

import java.util.Scanner;
public class  VowelOrConsonants {

       public String CheckVowelOrConsonants(String sentence){
        String result="";

        for (int i=0 ; i<sentence.length(); i++)
        {
            char letter = sentence.charAt(i);
            if(letter == 'a'|| letter == 'e'|| letter == 'i' || letter == 'o' || letter == 'u'|| letter == ' ')
            {
                result+="vowel";
            }
            else if((letter > 'a' && letter < 'z') || (letter > 'A' && letter < 'Z'))
                {
                    result+="consonant";
                }
            else {
                result += "Not a character";
            }
        }return result;

    }
}