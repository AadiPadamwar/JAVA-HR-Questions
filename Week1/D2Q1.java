/*
During the code-based test of Java, Peter has been assigned a task to implement a class which reads the Account Number(Long), 
Account Holder Name(String), Gender (M/F) (Character) and Amount (Integer) to be withdrawn at runtime.
Given that the Current Account Balance is 20000,
it is expected to perform the withdrawl if amount to be withdrawn is less than or equal to 20000 and message to be displayed is.
Hi Mr./Ms. XXX! Your Account Balance after withdrawl is YYYYY.
If the amount to be withdrawn is greater than the Current Account Balance, then the message displayed is:
Hi Mr./Ms. XXX! Insufficient Funds! You can not withdraw AAAAA.

Input Format
------------
First line reads Account Number
Second line reads Account Holder Name
Third line reads Gender
Fourth line reads Amount to be withdrawn

Constraints
-----------
Account Number is a 10 digit number

Output Format
-------------
Hi Mr./Ms. XXX! Your Account Balance after withdrawl is YYYYY.
*/

import java.io.*;
import java.util.*;

public class D2Q1 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        long AN=in.nextLong();
        
        String name = in.nextLine();
        name=in.nextLine();
            
        char gen=in.next().charAt(0);
        int amount=in.nextInt();
        
        int finalAmount=20000-amount;
        String lene=Long.toString(AN);
        int len=lene.length();
        
        String a;
        if(gen=='M')
        {
            a="Mr.";
        }
        
        else
        {
            a="Ms.";
        }
            if(amount<=20000)
            {
                System.out.println("Hi "+a+" "+name+"!");
                System.out.println("Your Account Balance after withdrawl is "+finalAmount+".");
            }
            
            else
            {
                System.out.println("Hi "+a+" "+name+"!");
                System.out.println("Insufficient Funds! You can not withdraw "+amount+".");
            }
        
           
    }
}
