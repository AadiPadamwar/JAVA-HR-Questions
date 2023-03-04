/*
Alice got task from his manager to maintain 2 decks of n numbers. As he easily put n numbers in one deck but for second deck he is bit confused so help him 
by creating one application in which once the n numbers are entered by bob, then parallely application will copy the content in second deck also.

Input Format
------------
First line will contain size In second line , enter the number as per according to size in first deck.

Constraints
--------------
Only integer values considered

Output Format
-------------
In first line , it will display the contants in actual deck. In second line , display same contents in second deck.
*/

import java.io.*;
import java.util.*;

public class D16Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int size=in.nextInt();
        int a[]=new int[size];
        int b[]=new int[size];
        
        for(int i=0; i<size; i++)
            a[i]=in.nextInt();
        
        for(int i=0; i<size; i++)
            b[i]=a[i];
        
        for(int i=0; i<size; i++)
            System.out.print(a[i]+" ");
        System.out.println();
        for(int i=0; i<size; i++)
            System.out.print(b[i]+" ");     
    }
}
