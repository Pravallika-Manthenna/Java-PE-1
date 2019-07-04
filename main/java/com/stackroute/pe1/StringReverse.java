package com.stackroute.pe1;
// program to find the reverese of the given string
import java.util.Scanner;
public class StringReverse
{
        public String ReverseString(String original){
        String reverse = "";
        int length = original.length();
        // if string given is empty or null
        if(original==" ")
            reverse = "Null not allowed";
        for (int i = length - 1 ; i >= 0 ; i--)
        {
            reverse = reverse + original.charAt(i);
        }
        return reverse.trim();
    }
}