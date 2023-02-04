/*
Rahul has taken the loan from bank. Write the java code to calculate the compoud interest which is paybale to bank after the years.
if the principal amount is less than 0 than
return 0.0 if the rate of interest is less than 0 than
return 0.0 if the Time period is less than 0 than
return 0.0 if number of times interest compounded is less than 0 than
return 0.0

Input Format
------------
Line 1: Enter the Principal: 15000 
Line 2: Enter the Rate of interest: 8.77 
Line 3: Enter the Time period : 8 
Line 4: Enter number of times interest is compounded: 7

Constraints
------------
principal amount, interest rate, year and number of times interest > 0

Output Format
-------------
Line 1: Compound Interest: 1646890.6976373557
*/
import java.io.*;
import java.util.*;

public class D3Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double P = in.nextDouble();
        double R = in.nextDouble();
        double T = in.nextDouble();
        double N = in.nextDouble();
        if (P<0 || R<0 || T<0 || N<0) {
            System.out.println("0.0");
        } else {
            double amo = P*(Math.pow((1+R/100),T*N));
            System.out.println(amo-P);
        }
    }
}
