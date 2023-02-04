/*
Mehar is in Pre-Nursery and she is learning counting. Her mother wants to test her so she gives her a number and asks her to count the number of digits in that number. 
Help Mehar by generating the program.

Input Format
------------
Integer number should be taken as input

Constraints
------------
Number should be a positive integer only.
Display Invalid Number in case of negative number

Output Format
-------------
Number Of digits(integer value)
*/

import java.io.*;
import java.util.*;
public class D15Q2 {
    public static void main(String[] args) 
    {
        Scanner in =  new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        if(n>0)
        {
            while(n!=0)
            {
              n=n/10;
              count++;
            }
            System.out.println(count);
        }
        else
            System.out.println("Invalid Number");
    }
}
