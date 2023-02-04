/*
Mehar's father wants Mehar to develop a program in which he wants to calculate the prize of the t-shirt. 
Prize of T-shirt = Cost Price + 18% GST. Develop an application in which Mehar's father gets Price of each t-shirt

Input Format
--------------
Integer value(Price of t-shirt) 
GST value(18%)

Constraints
------------
Price should be an integer value
Price should be greater than 450

Output Format
---------------
Print total price including GST.
*/

import java.io.*;
import java.util.*;

public class D10Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int price=in.nextInt();
        String type=((Object)price).getClass().getSimpleName();
        
        float gst=(float)(price*0.18);
        float total=price+gst;
        
        if (price>450){
            System.out.println(String.format("%.2f", total));
        }
        else if(price<450 || type!="Integer"){
            System.out.println("Invalid Input");
        }
    }
}
