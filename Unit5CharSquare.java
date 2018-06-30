//assignment info: Modify the method created in classwork #2 to receive a second parameter of type char called fillCharacter. Form the square using the char provided as an argument. Use the following statement (in which input is a Scanner object) to read a character from the user at the keyboard: char fill = input.next().charAt(0); Thus, if side is 5 and fillCharacter is #, the method should display
//name: said ahmed
//date: 10 june 2018

import java.util.Scanner;

public class Unit5CharSquare{
   public static void main(String[] args){
      Scanner keyboard=new Scanner(System.in);
      int x;
      char y;
      
      System.out.println("Enter Square size: "); 
      x=keyboard.nextInt(); // user inputs how many charcters in row and column
      
      System.out.println("Enter chracter to be filled: ");
      y=keyboard.next( ).charAt(0); // user inputs character
      
      yCharacter(x,y); // calls method
      System.exit(0);
   }
   
   public static void yCharacter(int s, char ch){
      for(int i=0;i<s;i++){
         for(int j=0;j<s;j++)
         System.out.print(ch);
         System.out.println();
      } // end of for
   } // end of yCharcter method
}// end of class

/* 
output: 
  ----jGRASP exec: java Unit5CharSquare
 Enter Square size: 
 5
 Enter chracter to be filled: 
 #
 #####
 #####
 #####
 #####
 #####
 
  ----jGRASP: operation complete.
*/ 