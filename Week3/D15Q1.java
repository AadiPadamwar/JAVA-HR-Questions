/*
Pranjal and little raghav are playing a game where Pranjal gives three strings to raghav and raghav has to find the greatest string among them. 
Write a program to help the raghav to find the greatest string among the three.

Input Format
------------
First line will contain first String statement
Second line will contain second String statement
Third line will contain third String statement

Constraints
------------
Maximum length of string can be 50.

Output Format
-----------------
one ineteger number representing length of largest string. if all the strings have same length then output should be -1.
*/

import java.io.*;
import java.util.*;

public class D15Q1 {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        String a=in.nextLine();
        String b=in.nextLine();
        String c=in.nextLine();
        
        int len_a=a.length();
        int len_b=b.length();
        int len_c=c.length();
        
        
        if(len_a>len_b && len_a>len_c)
            System.out.println(len_a);
        
        else if(len_b>len_a && len_b>len_c)
            System.out.println(len_b);
        
        else if(len_c>len_b && len_c>len_a)
            System.out.println(len_c);
        
        else if(len_a==len_b && len_a==len_c)
            System.out.println("-1");
    }
}
