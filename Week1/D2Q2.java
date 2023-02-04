/*
Alex has got a Mathematical assignment where he has to find whether a given integer N is a Perfect Cube or not. Write a Java program solution to help Alex.

Input Format
------------
First line will contain an integer N

Constraints
-----------
N>1 & N<1000

Output Format
--------------
return "Perfect Cube" If given integer is a perfect Cube or "Not Perfect Cube" incase it is not
*/

import java.io.*;
import java.util.*;

public class D2Q2 {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int N=in.nextInt();
        int cube=0;
        int flag=0;
        
        for (int i=0;i<=N;i++) 
        {
            cube=i*i*i;
            if (cube==N) 
            {
                flag=1;
                break;
            }
            
            else if(cube>N)
            {
                flag=0;          
            }
        }

        
        if(N>1 && N<1000)
        {
            if(flag==1)
                System.out.println("Perfect Cube");
            else
                System.out.println("Not Perfect Cube");
        }
    }
}
