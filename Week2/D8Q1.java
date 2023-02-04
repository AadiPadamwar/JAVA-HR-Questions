/*
Write a program to calculate the area of triangle using heron’s formula. Semi perimeter should be displayed in float and area should be displayed in double.
It should take input as int type. semi-perimeter:(a+b+c)/2; Heron’s formula for area of triangle is: Math.sqrt(s*(s-a)(s-b)(s-c)). 
where a,b,c are representing three sides of a triangle

Input Format
------------
Your program should take three inputs of int type which represents the sides of a triangle.

Constraints
------------
Input should be positive. the area should be displayed as 0 if the either side is given zero as input.

Output Format
--------------
Ist line should display Semi perimeter in float type. 2nd line should display area of the triangle in double type.
*/


import java.io.*;
import java.util.*;

public class D8Q1 {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        
        float s=((float)(a+b+c)/2);
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        if (a>0 && b>0 && c>0)
        {
            System.out.println(s);
            System.out.println(area);
        }
        else if(a<0 || b<0 || c<0)
        {
            System.out.println("0");
        }
        
    }
}
