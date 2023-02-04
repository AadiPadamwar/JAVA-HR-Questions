/*
Prof. Decosta has designed multiple sets of the question paper of CSE310: Programming in Java subject. 
He has assigned a separate character code (A-Z) to each set of question paper but mentioned the paper codes using binary numbers. 
He needs a program which can accept the binary paper code and convert it in to character code so that he can easily identify the paper code during evaluation. 
If the paper code entered is not having 8 bits (0 or 1) or does not corresponds to A-Z then INVALID PAPER CODE must be printed.

Input Format
-------------
First line of input is a Binary Number representing the Paper Code

Constraints
-----------
Paper code is a 8 bit binary code

Output Format
--------------
Print the Paper Code (Character) and INVALID PAPER CODE if the input is not correct.
*/

import java.io.*;
import java.util.*;

public class D7Q1
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        
        int dec_value=0;
        int value=0;
        int base=1;

        int len=num.length();
        for (int i=len-1;i>=0;i--) 
        {
            if (num.charAt(i)=='1')
            {
                value+=base;
            }    
            base=base*2;
        }
        
        dec_value=value;
        char ch=(char)dec_value;
        
        if(dec_value<65 || dec_value>90)
        {
            System.out.println("INVALID PAPER CODE");
        }
        else
        {
            System.out.println(ch);
        }
    }
}
