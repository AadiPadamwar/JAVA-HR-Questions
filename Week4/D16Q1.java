/*
WAP to accept 10 integer elements into an array, and find the avarage of the elements of the array excluding the largest and smallest element of the array.

Input Format
------------
Accept 10 positive integers in to an array

Constraints
------------
all 10 number must be unique and must be positive and >0

Output Format
-------------
print the Avarage
*/


import java.io.*;
import java.util.*;

public class D16Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int []arr = new int[10];
        int sum=0;
        
        for(int i=0;i<10;i++)
           arr[i]=in.nextInt();
        
        Arrays.sort(arr);
        arr[0]=0;
        arr[9]=0;
        
        for(int i=0;i<10;i++)
            sum=sum+arr[i];
        
        System.out.println(sum);
    }
}
