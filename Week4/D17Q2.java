/*
Jasmine and jack created 2 different arrays to store their products which they have purchased from super market. 
Then they compared their products to identify the count of similar products they have purchased

Input Format
------------
Milk Toy Chair Stool
Stool Bag Watch Milk

Constraints
-------------
Create two different String array of size 4
Compare and display the result in integers

Output Format
--------------
2
*/

import java.io.*;
import java.util.*;

public class D17Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String arr1[]=new String[4];
        String arr2[]=new String[4];
        int count=0;
        
        for(int i=0; i<4; i++)
            arr1[i]=in.next();
        for(int i=0; i<4; i++)
            arr2[i]=in.next();
        
        
        for(int i=0; i<4; i++)
        {
            String a=arr1[i];
            for(int j=0; j<4; j++)
            {
                String b=arr2[j];
                if(a.equals(b))
                    count++;
            }
        }
        System.out.println(count);
    }
}
