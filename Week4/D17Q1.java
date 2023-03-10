/*
Suppose that you are asked to input the size of an array and then enter integer type elements in it. 
Write a program which works as follows: 
1) If input of array size is less than 1, then "Invalid Array Size" should be displayed and no other input should be taken. 
2) Find and print the smallest element in the array.

Input Format
------------
Program should take 2 types of inputs in following sequence: 1) Size of array 2) Elements in array Example: 4 22 44 12 56

Constraints
-----------
Size of the array should be greater than 0. i.e. 0 < n <50

Output Format
-------------
If input of array size is negative, then "Invalid Array Size" should be displayed and no other input should be taken. If input array is: 22 44 12 56 then print smallest element as: 12
*/

import java.io.*;
import java.util.*;

public class D17Q1 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        
        int N=in.nextInt();
        
        if(N<1)
        {
            System.out.print("Invalid Array Size");
            return;
        }
      
        int arr[]=new int[N];
        
        for(int i=0; i<N; i++)
            arr[i]=in.nextInt();
        
        Arrays.sort(arr);
        System.out.print(arr[0]);
    
    }
}



