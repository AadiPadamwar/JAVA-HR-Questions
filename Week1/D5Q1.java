/*
In a course students are had 2 code based test, one project and one quiz. Enter their marks scored in all the CA components. Print the sum of all the components.

Input Format
-------------
First line will contain marks of CBT1
Second line will contain marks of CBT2
Third line will contain marks of project
Fourth line will contain marks of quiz

Constraints
------------
CBT1 and CBT2 marks will be between 0 and 20
Project marks should be between 0 and 15
Quiz marks should be between 0 and 5

Output Format
------------
One numeric value printing sum of CA marks
*/

import java.io.*;
import java.util.*;

public class D5Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int CBT1 = in.nextInt();
        int CBT2 = in.nextInt();
        int project = in.nextInt();
        int quiz = in.nextInt();
        int sum=0;
        
        if(CBT1>0 && CBT1<20 && CBT2>0 && CBT2<20 && project>0 && project<15 && quiz>0 && quiz<5)
        {
            sum=CBT1+CBT2+project+quiz;
            System.out.println(sum);
        }
        else
        {
            System.out.println("Invalid Input");
        }
        
    }
}
