/*
Akash got a assignment in which he has to identify whether given integer N is multiple of integer K or not. 
Write a java programming solution to help akash.
Input Format
--------------
First Line contain integer N
Second Line contain integer K
Constraints
------------
N>1 & N<1000
K>1 & K<100
Output Format
--------------
Return "Multiple" incase it is multiple or "Not Multiple" incase it is not multiple.
*/


import java.io.*;
import java.util.*;

public class D1Q1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if (N > 1 && N < 1000) 
        {
            if (K > 1 && K < 100) 
            {
                if (N % K == 0) 
                {
                    System.out.println("Multiple");
                } 
                else 
                {
                    System.out.println("Not Multiple");
                }
            }

        }
    }
}
