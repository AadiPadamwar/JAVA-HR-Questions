/*
Rajesh is friend of Rahul. Rajesh visited to Rahul's house and then he got to know that Rahul is not well and having temprature 102 degree Fahrenheit. 
Rajesh is not able to understand the temprature in Fahrenheit so try to help him to covert it into Celsius.

Input Format
--------------
First Line will contain an integer representing to temprature in Fahrenheit

Constraints
--------------
Input will be integer value between 95 to 105

Output Format
-------------
one float value represnting in Celsius
*/

import java.io.*;
import java.util.*;

public class D9Q1 {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        double temp=in.nextDouble();
        double T=0;
        
        if(temp<95 || temp>105){
           System.out.println("Invalid");
        }
        else{
            
            T=(temp-32)/1.8000;
            System.out.println(String.format("%.1f", T));
        }
        
    }
}
