package com.stackroute.pe1;
// program to iterate the numbers
public class NumberSeries {

    public String IterationNumbers(int number) {
        String str = "";
        // if number is negative
        if(number < 0){
            return "Negative numbers are not allowed";
        }
        // if number is less than 1
        else if (number < 1) {
            return "Cannot be Less than 1";
        } else {

            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {
                    str = str + i;
                }
            }
        }return str;
    }
}
