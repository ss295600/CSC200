import java.util.*;

public class String02{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
         String s1 = "Hi";
         String s2 = "Hello";
         
         
         if (s1.equals(s2)) // same as (s1 == s2)
            System.out.println("same contents");
         else
            System.out.println("different contents"); // if s1 and s2 both said Hi, it'll say same contents
         
   
   }
}