import java.util.Scanner; 

public class UpperCase{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in); 
      System.out.print("Enter a lowercase letter: "); 
      String input = keyboard.next();
      for(int i=0;i<input.length();i++){
         System.out.println(" " + Character.toUpperCase(input.charAt(i)));
      }
      
   }   
}