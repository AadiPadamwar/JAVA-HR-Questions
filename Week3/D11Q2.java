/*
Rahul borrowed an amount from his friend and he needs to repay the total amount within a year with additional interest of 10%. 
Find the total amount and emi that Rahul has to pay

Input Format
------------
200000

Constraints
-------------
Emi value round off to 2 decimal places

Output Format
------------
220000
18333.33
*/

import java.io.*;
import java.util.*;

public class D11Q2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        double b= 0.1*p;
        int c=(int)(p+b);
        double d=c;
        double e=d/12;
        int x=(int)e;
        
        if (x==e){
            System.out.println(c);
            System.out.println(x);
            return;
        }
        System.out.println(c);
        System.out.println(String.format("%.2f",e ));
        
        
    }
}
