/*
My son Priyanshu got an assignment from his teacher to perform multiplication of complex number.
Help him to complete his assignment. Write a java code with following features:
class Name: Complex
Instance Variable: real, imaginary (int type)
Constructor: **
1. Complex()
2. Complex(int, int)

**Instance Method:
1. Mul_Complex(Complex, Complex)
2. Display()
Read the real and imaginary from user and pass to the constructor as parameter
Write a separate class Test_Complex with a main() method and test the Complex class methods

Input Format
-------------
First line Read the complex number 1 for real and imaginary First line Read the complex number 2 for real and imaginary

Constraints
------------
real, imaginary > 1

Output Format
------------
Print the Result in form of complex number : a+bi
*/

import java.io.*;
import java.util.*;

class Complex {

    int real, imaginary;

    Complex() {
        real = 0;
        imaginary = 0;
    }

    Complex(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    void Mul_Complex(Complex a, Complex b) {
        real = (a.real * b.real) - (a.imaginary * b.imaginary);
        imaginary = (a.real * b.imaginary) + (a.imaginary * b.real);
    }

    void display() {
        System.out.println(real + "+" + imaginary + "i");
    }

}

public class D24Q2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] nums = in.nextLine().split(" ");
        int a1 = Integer.parseInt(nums[0]);

        int a2 = 0;

        if (nums.length != 1)
            a2 = Integer.parseInt(nums[1]);

        String[] nums1 = in.nextLine().split(" ");
        int b1 = Integer.parseInt(nums1[0]);
        int b2 = Integer.parseInt(nums1[1]);

        Complex o1 = new Complex(a1, a2);
        Complex o2 = new Complex(b1, b2);
        Complex o3 = new Complex();

        o3.Mul_Complex(o1, o2);
        o3.display();
    }
}
