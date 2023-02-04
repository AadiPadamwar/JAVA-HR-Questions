/*
Consider that two friends Neha and Nisha are going for shopping. Neha has picked the N number of Items from the Market and Nisha has picked X number of Items 
from the Market. Find out total numbers of Items ordered by both.

Input Format
------------
In First input line, you should enter number of Items ordered by Neha.
In Second input line, you should enter number of Items ordered by Nisha.

Constraints
------------
Enter only integer (positive) value.
0<=n<=100

Output Format
--------------
Total numbers of items ordered by Neha and Nisha during shopping.
*/

import java.io.*;
import java.util.*;

public class D7Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x=in.nextInt();
        int y=in.nextInt();
        System.out.println(x+y);
    }
}
