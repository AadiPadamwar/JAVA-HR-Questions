/*
Shivam is friend of Keshav. Shivam visited Keshav house because he got to know that Keshav is not well. 
Keshav's Mother told that Shivam have temprature 40 degree Celsius. 
Shivam is confused that at 40 degree celsius how Keshav can have fever. He want to convert it into Fahrenheit. Help him to solve the problem.

Input Format
------------
First line will contain an integer representing to temperature in Celsius.

Constraints
------------
Input will be integer value between 30 to 45.

Output Format
--------------
One float value representing temprature in Fahrenheit.
*/

import java.io.*;
import java.util.*;

public class D9Q2 {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int temp=in.nextInt();
        float C=(float)((temp*1.8000)+32);
        
        if(temp>30 && temp<45){
            System.out.println(String.format("%.1f", C));
        }
        else{
            System.out.println("Invalid Input");
        }
        
    }
}
