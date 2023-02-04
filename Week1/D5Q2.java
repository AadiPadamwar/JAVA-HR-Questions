/*
Nikhil wants to celebrate his birthday in school by distributing chocolates to his friends. 
He decided to distribute chocolates equally by dividing total number of chocolates with his total number of friends.

Input Format
-------------
In First Line, enter total number of choclates. In second line, enter a number with whome nikhil wants to divide.

Constraints
------------
Both the numbers must carries integer value only.

Output Format
--------------
Division result is display as output.
*/

import java.io.*;
import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(a/b);
    }
}
