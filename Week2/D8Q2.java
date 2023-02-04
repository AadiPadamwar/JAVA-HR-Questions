/*
Mohan asked his friend to write a java code to find the average of three double or float number and store in integer data type and display the result.
If the number in less than zero(0) or greter than 100 than display the error "invalid input" other wise compute the avarge of three number and displat the result.

Input Format
-------------
the three number data types should be double or float.

Constraints
------------
0.0 < a, b, c < 100.00

Output Format
-------------
output should be in int.
*/

import java.io.*;
import java.util.*;

public class D8Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float a=in.nextFloat();
        float b=in.nextFloat();
        float c=in.nextFloat();
        int average=((int)((a+b+c)/3));
        
        if(a>0.0 && a<100.00 && b>0.0 && b<100.00 && c>0.0 && c<100.00)
        {
            System.out.println(average);
        }
        else
        {
            System.out.println("invalid input");
        }
    }
}
