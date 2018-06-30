// Lab 2: Sales.java
// Program calculates sales, based on an input of product
// number and quantity sold
// Name: Said Ahmed
// Date: June 01, 2018 

import java.util.Scanner;
public class Sales{
   public static void main(String[] args) {
      Scanner input = new Scanner( System.in );

      double totalRetail=0;
      while(true){

         System.out.println("1 - Product 1, $2.98");
         System.out.println("2 - Product 2, $4.50");
         System.out.println("3 - Product 3, $9.98");
         System.out.println("4 - Product 4, $4.49");
         System.out.println("5 - Product 5, $6.87");
         System.out.println("6 - Exit program");
         System.out.print("Enter product number: ");
         int productnumber = input.nextInt();

         if(productnumber==6){
            break;
         }

      System.out.print("Enter quantity sold: ");
      int quantitySold = input.nextInt();

      switch(productnumber){
         case 1:
         totalRetail+=2.98*quantitySold;
         break;
         case 2:
         totalRetail+=4.50*quantitySold;
         break;
         case 3:
         totalRetail+=9.98*quantitySold;
         break;
         case 4:
         totalRetail+=4.49*quantitySold;
         break;
         case 5:
         totalRetail+=6.87*quantitySold;
         break;
      }

      System.out.println("\nThe total retail value of all products sold: $"+totalRetail);
      }
   }
}

/*
Sample Output: 

1 - Product 1, $2.98
 2 - Product 2, $4.50
 3 - Product 3, $9.98
 4 - Product 4, $4.49
 5 - Product 5, $6.87
 6 - Exit program
 Enter product number: 1
 Enter quantity sold: 5
 
 The total retail value of all products sold: $14.9
 1 - Product 1, $2.98
 2 - Product 2, $4.50
 3 - Product 3, $9.98
 4 - Product 4, $4.49
 5 - Product 5, $6.87
 6 - Exit program
 Enter product number: 6
 
 
 */