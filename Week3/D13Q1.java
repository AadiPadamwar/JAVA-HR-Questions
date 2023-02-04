/*
Sajal and Ruhi are playing a game. Sajal is going to tell one number and one operation (Even, Odd, Prime and Factorial), 
Ruhi have to apply the operation and tell the output.

Input Format
--------------
Two space seperated numbers, first number on which need to apply operation and second number will be 1 for checking the number is even or not, 
2 for checking number is odd or not, 3 for checking number is prime or not and 4 for calculating factorial of number.

Constraints
------------
First number will be positive integer value. Second number can be in range of 1 to 4.

Output Format
-------------
Yes / No for first three operations and an integer value if operation four is performed.
*/

import java.io.*;
import java.util.*;

public class D13Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] n = new int[2];
        
        for(int i=0;i<2;i++)
        {
             n[i] = in.nextInt();
        }
        
        int a=n[0];
        int b=n[1];
        int fact=1;
        
        if(b==1)
        {
            if(a%2==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        
        else if(b==2)
        {
            if(a%2!=0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        
        else if(b==3)
        {
            int count = 0;
            for (int i=1; i<=a;i++)
            {
                if (a%i==0)
                    count++;
            }
            if(count==2)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else if(b==4)
        {
              for(int i=1;i<=a;i++)
                  fact=fact*i;
            System.out.println(fact);
        }
    }
}
