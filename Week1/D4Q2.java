/*
Shyam asked his friend Venu to develope a program which is use to perfome arithmetic operation. He told that When I will enter two number and operator
it will perform operation based on given operator and result will display.

Input Format
-------------
Line 1: Enter number 1: 5 Line 2: Enter number 2: 5 Line 3: Enter operator : +

Constraints
-------------
number should be integer number.

Output Format
-------------
10
*/

import java.io.*;
import java.util.*;

public class D4Q2 {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
        int a=in.nextInt();
        int b=in.nextInt();
        char op=in.next().charAt(0);
        
        if(op=='+'){
            System.out.println(a+b);
        }
        
        else if(op=='-'){
            System.out.println(a-b);
        }
        
        else if(op=='*'){
            System.out.println(a*b);
        }
        
        else if(op=='/'){
            System.out.println(a/b);
        }
        else if(op=='%'){
            System.out.println(a%b);
        }
        
        else{
            System.out.println("Invalid arithmetic operators");
        }
    }
}
