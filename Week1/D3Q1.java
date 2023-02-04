/*
Write a program to take the name from the user as input. Display the name with greeting as Good Morning name.

Input Format
------------
Your program should take name as String.

Constraints
------------
Input should be String value.

Output Format
-------------
Output should be the name with Greeting Good Morning.
*/

import java.io.*;
import java.util.*;

public class D3Q1 {

    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
        
        String name = in.nextLine();
        
        System.out.println("Good Morning "+name);
    }
}
