import java.util.*;

public class String03{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
         String s1 = "Hi";
         String s2 = "hi";
         
         
         if (s1.compareTo(s2)  >0) // same as (s1 == s2)
            System.out.println(s1 + "after" + s2);
         else if(s1.compareTo(s2) == 0)
            System.out.println("same"); 
         else 
            System.out.println(s1 + " before " + s2); // if s1 and s2 both said Hi, it'll say same contents
         
   
   }
}