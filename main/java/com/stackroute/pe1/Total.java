package com.stackroute.pe1;
// program to add the numbers in an array
public class Total {

    public String total(String number)//Method to add numbers in array
    {
        int sum = 0;

        String string = "";
        String[] array = number.split(" ");
        int arr[] = new int[array.length];
        try {
            for (int i = 0; i < array.length; i++) {
                arr[i] = Integer.parseInt(array[i]);

            }
        } catch (Exception exception) {
            string = "Throws exception";
            return string;
        }
        for (int i = 0; i < array.length; i++) {
            sum = arr[i] + sum;

        }
        string = "" + sum;
        return (string);
    }
}