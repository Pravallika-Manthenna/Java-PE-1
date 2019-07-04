package com.stackroute.pe1;
//program to find even or odd and also number is between 20 and 30
import java.util.Scanner;
public class TomOrJerry {
    public String odd(int number){
        String result=null;
        // if number is odd
        if(number % 2 !=0 &&(number >20 && number <30)){
            result="Tom";
        }
        // if number is even
        else if(number % 2 == 0 &&(number >20 && number<30)){
            result = "Jerry";
        }
        // if guiven number is negative
        else if(number < 0)
        {
            result = "Negative number not allowed";
        }
        // if number is not there between 20 and 30
        else {
            return "Number is not there between 20 to 30";
        }
        return result;
    }
}
