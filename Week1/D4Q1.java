/*
Write a program to take the 3 inputs of integer type from the user. Display the values separated by symbol ‘*’ 
if the values are positive otherwise display the message “Invalid Input”.

Input Format
-------------
Your program should take 3 inputs of integer type.

Constraints
-------------
Input should be positive integers

Output Format
--------------
Output should be the input values separated by ‘*‘ or “Invalid Input” message if any input is negative.
*/

import java.io.*;
import java.util.*;

public class D4Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        
        if(a>0 && b>0 && c>0)
        {
            System.out.println(a+"*"+b+"*"+c);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
