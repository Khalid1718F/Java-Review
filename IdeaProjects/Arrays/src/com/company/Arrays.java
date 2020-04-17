/*This program will show us how to use arrays as well as their corresponding methods.
 */

package com.company;

public class Arrays
{

    public static void main(String[] args)
    {
        //Here we declare a variable of type int and add square brackets to it to indicate it is an array of integers.
        //We set it equal to a new integer with a value inside the brackets to indicate the size of the integer array.
        int[] intArray = new int[3];
        //We then assign integer values to each element in our integer array based on its index position.
        intArray[0] = 5;
        intArray[1] = 10;
        intArray[2] = 15;
        //Now we print out the values of each element inn our integer array.
        System.out.println(intArray[0] + " " + intArray[1] + " " + intArray[2]);

        //Here we declare a String variable and add square brackets to indicate it is an array of Strings.
        //We set it equal to a new String with a value inside the brackets to indicate the size of the String array.
        String[] stringArray = new String[3];
        //We then assign a string value to each element in our String array based on the index position.
        stringArray[0] = "First";
        stringArray[1] = "Second";
        stringArray[2] = "Third";
        //Now we print out the value of each element in our String array.
        System.out.println(stringArray[0] + " " + stringArray[1] + " " + stringArray[2]);

        //Here we have an example of an integer array list.
        //First we declare a variable of type int and put square brackets after it.
        //Then we use curly braces to add the elements of the list and separate them by commas.
        int[] numbers = {1, 2, 3, 4, 5};
        //Now we print out specific elements of our integer array list using the index position.
        System.out.println(numbers[0] + " " + numbers[2] + " " + numbers[4]);


        //Here we have an example of a String array list.
        //First we declare a variable of type String and put square brackets after it.
        //Then we use curly braces to add the elements of the list and separate them by commas.
        String[] strings = {"Hello!", "Hi!", "How are you?"};
        //Now we print specific elements of our String array list.
        System.out.println(strings[0] + " " + strings[1] + " " + strings[2]);
    }
}
