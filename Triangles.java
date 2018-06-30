// Lab 1: Triangles.java
// Program prints four triangles, one below the other 3 
// Name: Said Ahmed
// Date: June 01, 2018
public class Triangles{
   public static void main(String args[]){
      for (int count =0; count < 10; count++){
         for (int i=0; i < count+1; i++)
         System.out.print("*");
         System.out.println();
      } // first triangle
      
      for (int count =11; count >= 0; count--){
         for (int i=0; i < count-1; i++)
         System.out.print("*");
         System.out.println();
      } // second triangle
      
      for(int count = 0; count < 10; count++){
          for(int index=1; index < count+1; index++)
          System.out.print(" ");
          for(int star=10; star > count; star--)
          System.out.print("*");
          System.out.println();
       } // third triangle
       
       for(int count = 10; count > 0; count--){
            for(int index=0; index < count-1; index++)
            System.out.print(" ");
            for(int star=10; star > count-1; star--)
            System.out.print("*");
            System.out.println();
        } // fourth triangle
   } // end main
} // end class Triangles

/* 
Sample Output

 *
 **
 ***
 ****
 *****
 ******
 *******
 ********
 *********
 **********
 **********
 *********
 ********
 *******
 ******
 *****
 ****
 ***
 **
 *
 
 
 **********
  *********
   ********
    *******
     ******
      *****
       ****
        ***
         **
          *
          *
         **
        ***
       ****
      *****
     ******
    *******
   ********
  *********
 **********
 
 */