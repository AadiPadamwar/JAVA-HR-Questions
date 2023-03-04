/*
Create a java class containing two methods. The first add method receives two integer arguments and second add method receives two String arguments. 
Both methods are named as add() and perform the addition of their parameters or concatenate strings when called. 
The user should press 1 or 2 to call respective methods and input of 2 integers or 2 strinngs is taken according to the methods called.

Input Format
-------------
1 or 2 to be taken in first line of input
second line accepts 2 int type inputs, when 1 is pressed or take 2 String type inputs when 1 is pressed.

Constraints
-----------
user never presses a number apart from 1 or 2 in first line.

Output Format
-------------
if a number entered in first line is not 1 or 2, display ERROR and exit. otherwise add 2 int numbers if 1 is pressed, or concatenate 2 strings if 2 is chosen
*/

import java.io.*;
import java.util.*;

public class D23Q2 {

    public void add(int n,int m)
    {
        System.out.println(n+m);
    }

    public void add(String s,String p)
    {
        System.out.print(s.concat(p));
    }
  
  
    public static void main(String[] args) 
    {
        D23Q2 ob=new D23Q2();
        Scanner in=new Scanner(System.in);

        int c=in.nextInt();

        if(c==1)
        {
            int n=in.nextInt();
            int m=in.nextInt();
            ob.add(n,m);
        }

        else if(c==2)
        {
            String s=in.next();
            String p=in.next();
            ob.add(s,p);
        }

        else
            System.out.println("ERROR");
    }
}
