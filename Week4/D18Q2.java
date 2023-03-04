/*
Bob is appointed as teacher of playway school, he got a task to assemble coloring kit for all the students. 
In that kit he is instructed to maintain set of these mentioned colors only “red,green,yellow,blue,black,white”. 
Now help bob by developing an application which help him to recognize the index number of color which so ever is entered by him as input.

Input Format
------------
Input is one of the color from color set which is mentioned in question.

Constraints
-----------
Only String type of data is entered without space.

Output Format
-------------
It will display index of color, which is entered by Bob.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String arr[]={"red","green","yellow","blue","black","white"};
        String ip=in.next();
        
        for(int i=0; i<arr.length; i++)
        {
            if(ip.equals(arr[i]))
            {
                System.out.print(i);
                break;
            }
                
        }
    }
}
