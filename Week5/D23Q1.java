/*
Mehar's teacher taught her ascending and descending order. In order to test the clarity of the same concept she gave her an array of elements that contained N numbers. 
Help Mehar by developing the program for the same. The program ask for two choices, i.e to print ascending order or descending order. 
The program should print ascending order on entering 1 and descending order on entering 2. 
If duplicate elements exist in an array then it should only print once in the output.

Input Format
-------------
Number of elements in an array
Elements of an array
Enter one choice out of two(1 or 2)

Constraints
-------------
N should not be less than 5 and greater than 15.

Output Format
-------------
Sorted array depending on the choice
*/

import java.io.*;
import java.util.*;

public class D23Q1 {

    static int removeDuplicates(int arr[], int n) 
    {
        if (n == 0 || n == 1)
            return n;

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++)
        {
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        }

        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        if (N < 5 || N > 15) 
            System.out.println("Invalid");
        
        else 
        {
            int[] arr = new int[N + 1];

            for (int i = 0; i < N; i++) 
                arr[i] = in.nextInt();
            Arrays.sort(arr);

            int choice = in.nextInt();

            if (choice == 1)
            {
                int n = arr.length;
                n = removeDuplicates(arr, n);
                for (int i = 1; i < n; i++)
                    System.out.print(arr[i] + " ");
            } 

            else 
            {
                int n = arr.length;
                Arrays.sort(arr);

                for (int i = 0; i < n / 2; i++) 
                {
                    int temp = arr[i];
                    arr[i] = arr[n - i - 1];
                    arr[n - i - 1] = temp;
                }

                n = removeDuplicates(arr, n);
                
                for (int i = 0; i < n - 1; i++)
                    System.out.print(arr[i] + " ");
            }
        }
    }
}
