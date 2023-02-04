/*
Peter is teaching ABCD.. to his younger brother through a game. The rules of the game include peter speaking 2 characters, and expecting his brother to speak 
all the alphabets in between based on the following conditions.
The two characters should be alphabets, in either case.
First alphabet should be smaller.
In all other cases ERROR should be displayed.

Input Format
-------------
two alphabets as input

Constraints
--------------
The two characters should be alphabets, in either case.
First alphabet should be smaller.
In all other cases ERROR should be displayed.

Output Format
-------------
Aplhabets in between or ERROR.
*/

import java.io.*;
import java.util.*;

public class D12Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        char first=in.next().charAt(0);
        char second=in.next().charAt(0);
        
        int a=first;
        int b=second;
        
        if(a<=b && a>=65 && a<=122 && b>=65 && b<=122)
        {
            for(int i=a;i<=b;i++)
            {
                System.out.print((char)i+" ");
            }
        }
        
        else
        {
            System.out.print("ERROR");
        }
    }
}
