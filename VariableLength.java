//assignment: Write an application that calculates the product of a series of integers that are passed to method product using a variable-length argument list. Test your method with several calls, each with a different number of arguments.
//name: 
//date: 23 june 2018


public class VariableLength{
   public static void main( String args[] ){
      int a = 1;
      int b = 2;
      int c = 3;
      int d = 4;
      int e = 5;
   
      System.out.printf( "a = %d, b = %d, c = %d, d = %d, e = %d\n\n", a, b, c, d, e );
      System.out.printf( "The variable of a and b is: %d ",
      vari( a, b ) );
      System.out.printf( "The variable of a, b and c is: %d ",
      vari( a, b, c ) );
      System.out.printf( "The variable of a, b, c and d is: %d ",
      vari( a, b, c, d ) );
      System.out.printf( "The variable of a, b, c, d and e is: %d ",
      vari( a, b, c, d, e ) );

   } // end main
   
   public static int vari( int... numbers ){
   
      int vari = 1;
      for ( int number : numbers )
      vari *= number;
      return vari;
   } // end method 

} // end class 

/* 
sample output: 
 ----jGRASP exec: java VariableLength
a = 1, b = 2, c = 3, d = 4, e = 5

The vari of a and b is: 2 The vari of a, b and c is: 6 The vari of a, b, c and d is: 24 The vari of a, b, c, d and e is: 120 
 ----jGRASP: operation complete.
*/ 


