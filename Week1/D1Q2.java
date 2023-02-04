/*Shruti is running a jewellery shop. She got calls from her customers to know the current price of silver and gold in different weights. 
Write a program to help Shruti to calculate price in the different weights when Shruti knows the weight of 1 Kg. Silver and 10 gm. Gold.

Input Format
------------
First line will contain a number representing 1Kg. Silver price.
Second line will contain a number representing 10gm. Gold Price.
Third Line will contain a String value Silver/Gold representing user input to know the price.
Fourth line will contain weight of silver/gold in grams for which user want price.

Constraints
-----------
Price cannot be -ve and maximum can be 1000000.
Weights entered by user can be between 0.01 gm to 1000 gms.

Output Format
--------------
One number representing value of gold/silver asked by user for a particular weight.
*/

import java.io.*;
import java.util.*;

public class D1Q2 {

    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        double S = in.nextDouble();
        double G = in.nextDouble();
        String T = in.next();
        double W = in.nextDouble();
        int P;

        if (W == 0.001)
            System.out.println("Invalid Input");
        else 
        {
            int s = (int) W;
            char ch = T.charAt(0);
            int y = (int) (S / 1000);
            int r = (int) (G / 10);

            if (ch == 'S')
                System.out.println(s * y);
            else if (ch == 'G')
                System.out.println(r * s);

        }
       
    }
}
