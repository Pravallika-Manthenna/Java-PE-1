package com.stackroute.pe1;
// program to find the reverese of the given string
import java.util.Scanner;
public class StringReverse
{
        public String ReverseString(String original){
        String reverse = "";
        StringBuffer buffer = new StringBuffer(original);
        int length = original.length();
        // if string given is empty or null
        if(original==" ")
            reverse = "Null not allowed";
        reverse += buffer.reverse();
        return reverse.trim();
    }
}