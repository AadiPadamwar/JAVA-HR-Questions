/*
Rajiv asked his friend to write a java code to check the given number is palindrom are not?
if the number is less than 9 or greater than 9999 than return "invalid input"

Sample 1:
Enter the number : 121
number is palindrome

Sample 2:
Enter the number : 122
number is not palindrome

Sample 3:
Enter the number : 7
invalid input

Input Format
-------------
first line of the input reads the number

Constraints
--------------
9 < n > 9999

Output Format
-------------
prints whether the number is palindrome or not.
*/

import java.io.*;
import java.util.*;

public class D12Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder input1 = new StringBuilder();
        
        int num=in.nextInt();
        
        String str=Integer.toString(num);
        String rev="";
        
        char ch[]=str.toCharArray();  
        for(int i=ch.length-1;i>=0;i--)
        {  
            rev+=ch[i];  
        }  
        Integer reve=Integer.valueOf(rev);
        
        
        if(num>9 && num<9999)
        {
            if(num==reve)
            {
                System.out.println("number is palindrome");
            }
            else
            {
                System.out.println("number is not palindrome");
            }
        }
        else
        {
            System.out.println("invalid input");
        }        
    }
}
