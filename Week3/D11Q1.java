/*
Ask the user to enter an input of integer type, which represents the number of rows. If the value entered by him is greater than 0, 
then display the pattern of numbers as explained in example below. 
Example: Pattern for rows to be displayed if user enters no. of rows as 5: 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1
If the input entered by user is negative no. then display the message “Invalid Rows” without any pattern.

Input Format
-------------
Your program should take the number of rows as integer input.

Constraints
------------
Number of rows should be positive int value. i.e. 1 <= n <= 10

Output Format
--------------
If input given is a positive number, then display the pattern. Otherwise, if input given is a negative or zero, then display the message “Invalid Rows”.
*/

import java.io.*;
import java.util.*;

public class D11Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
        if(n>=1 && n<=10)
        {     
         for(int i=n;i>=0;i--)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print(j+" ");

             }
            if(i!=1){
                System.out.println();
            }
             
         }
        }
        else
        {
            System.out.println("Invalid Rows");
        }
    }
}
