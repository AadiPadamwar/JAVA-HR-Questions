/*
Prof. Joe has asked his student Pappu Singh to implement a Java program which can calculate the average CA marks of all the subjects that Pappu is studying in 
this semester using 2-D Array/ Jagged Array. There are N number of subjects and different subjects may have different number of Academic Tasks 
(each with maximum marks 10). Prof. Joe is expecting that all the CA marks are stored in the array and average marks of any subject can be checked randomly.

Input Format
------------
First line reads the number of subjects N
Next N lines read the number of CAs in the subject and marks of the CAs separated by SPACE
Last line reads the subject number for which the average marks to be displayed.

Example:
3
2 9.25 6.5
4 2.5 4.25 6.0 1.25
3 7.25 3.75 6.5
2

Constraints
-------------
N>0
Marks >= 0

Output Format
-------------
Prints the average marks in the subject
*/

import java.io.*;
import java.util.*;

public class D19Q1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        float arr[] = new float[n];

        for (int i = 0; i < n; i++) 
        {
            int a = in.nextInt();
            float sum = 0;

            for (int j = 0; j < a; j++) 
            {
                float b = in.nextFloat();
                sum = sum + b;
            }
            arr[i] = sum / a;
        }
        int f = in.nextInt();

        System.out.print("Average in Subject-" + f + " is " + arr[f - 1]);
    }

}
