/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Input Format
------------
In first line programmer will enter size of array as N example 5 In second line again programmer enter distinct integer elements of array from 1 to N example 1 3 4 5

Constraints
-------------
1 ≤ N ≤ 106 1 ≤ A[i] ≤ 106

Output Format
--------------
application will display missing element example 2
*/

import java.io.*;
import java.util.*;

public class D13Q2 {
    
    public static int getMissingNumber(int[] arr,int n)
    {
        int total = n * (n + 1) / 2;
        int sum = Arrays.stream(arr).sum();
        return total - sum;
    }
 
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int t=in.nextInt();
        int[] arr=new int[t];
        
        for(int i=0;i<t-1;i++)
        {
             arr[i] = in.nextInt();
        }
 
        System.out.println(getMissingNumber(arr,t));
    }
     
}
