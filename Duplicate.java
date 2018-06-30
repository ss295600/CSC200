//assignment info: Use a one-dimensional array to solve the following problem: Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,” in which all five numbers are different. Use the smallest possible array to solve this problem. Display the complete set of unique values input after the user enters each new value.
//name: said ahmed
//date: 23 june 2018

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate{
    public static void main(String[] args) {
        int[] array = new int[5];
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any 5 digit between 10 to 100");
        for (int i = 0; i < array.length; i++) {
            do {
                System.out.println("Enter element " + (i + 1) + " :");
                temp = input.nextInt();
                if (temp >= 10 && temp <= 100)
                    array[i] = temp;
                else
                    System.out.println("Entered Invalid number");
            } while (temp < 10 || temp > 100);
        }
        System.out.println("Unique Elements are :");
        printx(array);
    }

    static void printx(int[] array) {
        int i;
        Arrays.sort(array);
        for (i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                System.out.print(array[i - 1] + " ");
            }
        }
        System.out.print(array[i - 1]);
    } //end printx method

} // end class

/* 
Sample Output
  ----jGRASP exec: java Duplicate
 Enter any 5 digit between 10 to 100
 Enter element 1 :
 34134
 Entered Invalid number
 Enter element 1 :
 34
 Enter element 2 :
 12
 Enter element 3 :
 342
 Entered Invalid number
 Enter element 3 :
 32
 Enter element 4 :
 34
 Enter element 5 :
 12
 
 Unique Elements are :12 32 34
  ----jGRASP: operation complete.

*/