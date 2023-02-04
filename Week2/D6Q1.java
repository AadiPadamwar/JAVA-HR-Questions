/*
Peter has been given an assignment to implement the code to convert the temprature from fahrenheit to celsius and vice versa. 
Kindly help him to implement the code such that user can choose the conversion type
1. fahrenheit to celsius
2. celsius to fahrenheit
and then enter the value of temperature to be converted and display the temptrature in the appropriate format.
If user enters the choice any thing else then print INVALID CHOICE

Input Format
---------------
First line will take the choice N (integer) as input i.e. 1 or 2
Second line will take the temperature (double) T as input

Constraints
------------
N >0 and N < 3

Output Format
--------------
Prints the double value i.e. the temperature
*/

import java.io.*;
import java.util.*;

public class D6Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N=in.nextInt();
        double temp = in.nextDouble();
        double T = 0;
        

        if(N==1)
        {
            T=(temp-32)/1.8000;
            System.out.println(String.format("%.2f", T));
        }
        else if(N==2)
        {
            T=(temp*1.8000)+32;
            System.out.println(String.format("%.2f", T));
        }
        else
        {
            System.out.println("INVALID CHOICE");
        }

    }
}
