/*
Write a program to take the input of int type which represents the number of rows and display the following type of pattern up to entered row number. 
If the input will be negative number, display the message “Invalid Rows” without pattern. Pattern for 4 rows: 
@ 
@@ 
@@@ 
@@@@

Input Format
------------
Your program should take the number of rows as input.

Constraints
-----------
Number of rows should be positive int value

Output Format
-------------
If input will be positive number display the pattern but if input will be negative (including zero), display the message “Invalid Rows”.
*/

import java.io.*;
import java.util.*;

public class D14Q1 {

    static public void main(String arv[]){
        Scanner in = new Scanner(System.in);
        
        int num=in.nextInt();

        if(num<=0)
            System.out.println("Invalid Rows");
        else
        {
            for(int i=1;i<=num;i++)
            {
                for(int j=1;j<=i;j++){
                    System.out.print("@");
                }
                System.out.println();
            }
        }
        
    }
}
