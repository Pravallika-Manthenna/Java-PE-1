package com.stackroute.pe1;
import java.util.Scanner;
// program to find palindrome or not
public class Palindrome {
    String result;
        public String DisplayPalindrome(int num){
        int sum = 0, reminder, reverse = 0;
        int temperary = num;
        while (num > 0) {
            reminder = num % 10;
            reverse = reverse * 10 + reminder;
            if ( reminder % 2 == 0)
                sum = sum + reminder;
            num = num / 10;
        }
        if (reverse == temperary) {
            if (sum > 25) {
                result = reverse + " is palindrome and sum of even numbers is greater than 25";
            } else {
                result = reverse + " is palindrome and sum of even numbers is lesser than 25";
            }
        } else {
            result = "Not a palindrome";
        }
            return result;
        }
    }


