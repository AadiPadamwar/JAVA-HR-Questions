/*
Jalandhar Public Bank has recently launched the Provident Fund Scheme and the CEO of the bank is looking for a java program to create a Provident Fund object 
such that customer should be allowed to open the account by providing any one of the id proofs Aadhar (long) or PAN (String) along with Full Name. 
It is also expected that the unique account number is assigned to the Customer in a serial order starting from A101 for Aadhar Card holders and P101 for PAN holders.

Input Format
-------------
First line reads the number of accounts to be opened N
N times,
Read the Name of the Customer
read the character (A/ P)
read the Aadhar Number of PAN accordingly

Constraints
-----------
N>0

Output Format
--------------
Prints the Account Numbers in separate lines
*/

import java.io.*;
import java.util.*;

public class D24Q1 {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int AC=100,PC=100;int t=0;
        
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];

        for(int i=0;i<n;i++)
        {
            String s=sc.nextLine();
            char c=sc.next().charAt(0);
            sc.nextLine();
            String p=sc.nextLine();

            if(c=='A')
            {
                AC++;
                arr[t++]="A"+AC;
            }

            else if(c=='P')
            {
                PC++;
                arr[t++]="P"+PC;
            }
        }

        for(int i=0;i<t;i++)
            System.out.println(arr[i]);  
    }
}



