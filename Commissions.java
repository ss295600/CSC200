/*assignment: Use a one-dimensional array to solve this problem: A company pays its salespeople on a commission basis. The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a salesperson who grosses $5,000 in sales in a week receives $200 plus 9% of $5,000, or a total of $650. Write an application (using an array of counters) that determines how many of the salespeople earned salaries in each of the following ranges: a) $200–299 b) $300–399 c) $400–499 d) $500–599 e) $600–699 f) $700–799 g) $800–899 h) $900–999 i) $1,000 and over. Summarize the results in tabular format.*/
//name: Said Ahmed
//date: 23 june 2018

import java.util.Scanner;

public class Commissions{
   public static void main(String[] args){
      int []salaries = { 0,0,0,0,0,0,0,0,0,0,0};
      wages(salaries);
      display (salaries);
      System.exit(0);
   }// end main
   public static void wages(int money[]){
      Scanner keyboard = new Scanner(System.in);
      double sales, i = 0.09;
      System.out.println("Enter employee gross sales(-1 to end): ");
      
      sales=keyboard.nextInt();
      while (sales !=-1){
         double salary = 200.0 + sales * i;
         System.out.println("Employee Commission is $" + salary);
         
         int x = (int) salary/100;
         ++money[(x<10?x:10)];
         System.out.println("Enter employee gross sales(-1 to end): ");
         
         sales=keyboard.nextInt();
       }//end while
    } // end method
         
         public static void display(int dollars[]){
            System.out.println("Employees in the range: ");
            for (int i = 2; i <10; ++i)
            System.out.println("$" + i + "00-$" +i+"99:"+dollars[i]);
            System.out.print("Over $1000: "+ dollars[10]);
         } // end method
 }//end clas
         
/* Sample Output: 

  ----jGRASP exec: java Commissions
 Enter employee gross sales(-1 to end): 
 2342
 Employee Commission is $410.78
 
 Enter employee gross sales(-1 to end): 
 3432
 Employee Commission is $508.88
 
 Enter employee gross sales(-1 to end): 
 3432
 Employee Commission is $508.88
 
 Enter employee gross sales(-1 to end): 
 -1
 Employees in the range: 
 
 $200-$299:0
 
 $300-$399:0
 
 $400-$499:1
 
 $500-$599:2
 
 $600-$699:0
 
 $700-$799:0
 
 $800-$899:0
 
 $900-$999:0
 
 Over $1000: 0
  ----jGRASP: operation complete.
*/