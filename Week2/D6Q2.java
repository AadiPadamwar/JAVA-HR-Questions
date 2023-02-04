/*
Arjun asked to his friend to write a java program to accept a two-digit number.
The Addition of the sum of its digits and the product of its digits.
If the value is equal to the number input, then display the message "special two digit number" otherwise, display the message "not a special two digit number".
If the value is not two digit number than display the message "invalid input"

Sample 1:
Line 1 : Enter two digit number: 25
Line 2 : not a special two digit number

Sample 2:
Line 1 : Enter two digit number: 59
Line 2 : special two digit number

Sample 3:
Line 1 : Enter two digit number: 5
Line 2 : invalid input

Input Format
------------
25

Constraints
------------
9 < n < 100

Output Format
--------------
not a special two digit number
*/

import java.io.*;
import java.util.*;

public class D6Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b;
        int c;
        if (num>9 & num<100) 
        {
            b=num%10;
            c=num/10;
            if (((b+c)+(b*c))==num) 
            {
                System.out.println("special two digit number");
            } 
            else 
            {
                System.out.println("not a special two digit number");
            }

        } 
        else if (num>99 || num<10) 
        {
            System.out.println("invalid input");
        }
    }
}
