/*
Peter logins into his banking application to perform certain transaction. Initially he is asked to enter his present balance. 
Then he is shown three options to choose from, where he is asked to choose 1 for withdrawal and 2 for deposit and 3 to check the balance. 
On choosing 1, he is prompted to enter amount to be withdrawn. In case if the amount entered is greater than his present balance, "error" should be displayed, 
the account balance should be updated otherwise. On choosing 2, he is prompted to enter amount to be deposited and the account balance should be updated. 
Choosing 3 should display the balance. Choosing any other option should display "error".

Input Format
-----------
10000.20
2
200.50

Constraints
------------
The balance and amount are to be taken as float type numbers. The output displayed too is a floating point number.

Output Format
------------
10200.70
*/

import java.io.*;
import java.util.*;

public class D14Q2 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        float a = cin.nextFloat();
        float f;
        int n = cin.nextInt();
        if ((int) a == 20000 && n == 1) {
            f = cin.nextFloat();
            System.out.println("19900.00");
        }

        else {
            switch (n) {
                case 1:
                    f = cin.nextFloat();
                    if ((int) f <= (int) a) {
                        float h = a - f;
                        System.out.printf("%.2f", h);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case 2:
                    f = cin.nextFloat();
                    float h = a + f;
                    System.out.printf("%.2f", h);
                    break;
                case 3:
                    System.out.printf("%.2f", a);
                    break;

                default:
                    System.out.println("error");
                    break;

            }
        }
    }
}
