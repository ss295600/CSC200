import java.util.*;

public class String04{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
         String s1 = "Apple ";
         // A P P L E
         
         for (int i =0; i<s1.length();i++){
            System.out.print (s1.toUpperCase().charAt(i) + " "); 
         
         }
         
         for (int i =0; i<s1.length();i++){
            System.out.print (s1.toLowerCase().charAt(i) + " "); 
         
         }
   }
}