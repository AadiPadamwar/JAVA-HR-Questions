/*
Consider Aman is visiting Nehru Zoo. He saw N elephants standing in a row. 
He wants to remove the elephants having the same height standing consecutively. Write a program for Aman so that he can get the desired sequence of elephants.

Input Format
------------
The first line will be containing one Integer representing a number of elephants .
The second line will contain integers representing the heights of the elephants.

Constraints
-----------
N>2 && N<30

Output Format
-------------
The desired sequence of elephants after removing elephants having the same height standing in consecutive.
*/

import java.io.*;
import java.util.*;

public class D18Q1 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        int N=in.nextInt();
  
        if(N<=2 || N>=30)
            System.out.print("Invalid Input");
        
        
        else
        {
            int arr[]=new int[N];
            int uni[]=new int[N];
            int j=0;
       
            for(int i=0; i<N; i++)
              arr[i]=in.nextInt();
        
            for (int i=0; i<N-1; i++) 
            {
                if (arr[i]!=arr[i+1]) 
                {
                    uni[j++] = arr[i];
                }
            }
            uni[j++]=arr[N-1];
        
            for(int i=0; i<j; i++)
                System.out.print(uni[i]+" ");
        }
        
    }
}
