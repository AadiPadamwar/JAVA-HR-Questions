/*
Sita visited mParivahan website in order to apply her driving license, but she is not aware about minimum age criteria. 
While filling application form , it first ask for applicant’s age, so according to age cretria if a person is less then or equal to 18 
then he/she is not eligible for applying sriving license. So as a programmer create one application, where user will enter age and accordingly application will 
print message as “Eligible” or “Not eligible” .

Input Format
-------------
First line contain age of a person.

Constraints
------------
Number must be integer.

Output Format
--------------
It will print message as “Eligible” or “Not eligible” as per according to age input by user.
*/

import java.io.*;
import java.util.*;

public class D10Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int age=in.nextInt();
        
        if(age>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
