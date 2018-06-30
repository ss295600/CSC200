/* assignment info: Write an application that uses String method compareTo to compare two strings input by the user. Output whether the first string is less than, equal to or greater than the second.
name: said ahmed
date: 26 june 2018
*/

import java.util.Scanner;

public class Comparing{ 
   public static void main(String[] args){
      String x,y;
      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter first word: ");
      x = in.nextLine();
      
      System.out.print("Enter second word: ");
      y = in.nextLine();
      
      int value;
      value = x.compareTo(y); // compareTo method
      
      if(value == 0)
         System.out.println(x+ " is equal to " + y);
      else if (value > 0)
         System.out.println(x + " is greater than " + y);
      else
         System.out.println(x + " is less than " + y);
         
      System.exit(0);
       
   } // end of main method
} // end of class