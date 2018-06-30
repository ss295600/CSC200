// Lab 1: Credit.java
// Program monitors accounts.
import java.util.Scanner;

public class Credit{
   // calculates the balance on several credit accounts
   public static void main(String[] args){
      Scanner input = new Scanner( System.in );
      
      int account; 
      int oldBalance; 
      int charges; 
      int credits; 
      int creditLimit; 
      int newBalance; 
      
      System.out.print( " Enter Account Number (or -1 to quit): "); 
      account = input.nextInt();
      
      // exit if the input is -1 otherwise, proceed with the program
      while ( account != -1)
      {
         System.out.println(" Enter Balance: "); 
         oldBalance = input.nextInt(); // read in original balance
         
         System.out.println(" Enter Charges: "); 
         charges = input.nextInt(); // read in charges
         
         System.out.println(" Enter Credits: "); 
         credits = input.nextInt(); // read in credits
         
         System.out.println(" Enter Credit Limit: "); 
         creditLimit = input.nextInt(); // read in credit limit
         
         // calculate and display new balance
         newBalance = oldBalance + charges - credits; 
         System.out.printf( "New balance is %d\n", newBalance ); 
         
         // display a warning if the user has exceed the credit limit
         if ( newBalance > creditLimit )
            System.out.println( "Credit limit exceeded" );
            
         System.out.print( "\nEnter Account Number (or -1 to quit): "); 
         account = input.nextInt(); // read in next account number 
         
      } // end while
    } // end method calculateBalance
} // end class Credit

/* 
Sample Output 

enter Account Number (or -1 to quit): 1
Enter Balance: 
100
Enter Charges: 
80
Enter Credits: 
25
Enter Credit Limit: 
200
New balance is 155

*/