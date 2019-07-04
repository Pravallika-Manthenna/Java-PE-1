package com.stackroute.pe1;
// program to guess a number
public class GuessedNumber {
    public static String find(int guess, int target){
        String string="";
        //if it is greater than guess
        if(target > guess){
            string = "Number guessed is less than the original number";
            return string;
        }// if it is equal
        else if (target == guess){
           string = "Number guessed matches original number";
           return string;
        }// if it is less than the guess
        else if(target < guess){
            string = "Number guessed is more than the original number";
            return string;
        }
        else{
            string="";
        }
        return string;
    }
}
