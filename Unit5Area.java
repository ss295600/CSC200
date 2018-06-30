//assignment: Write an application that prompts the user for the radius of a circle and uses a method called circleArea to calculate the area of the circle.
//name: said ahmed
//date: 10 june 18

import java.util.Scanner;

public class Unit5Area{
   public static void main(String[] args){
      Scanner input=new Scanner(System.in);
      Circle circ=new Circle();//call method
      circ.area();//call method
   }//end of main

} // end of public class

class Circle{
   public void area(){
      Scanner input=new Scanner(System.in);
   
      double rad; //radius
      double area; //area
   
   
      System.out.println("Enter the radius: ");
      rad=input.nextDouble(); //user inputs radius
      area=circum(rad);
      System.out.println("Area of Circle: "+area);
      }//end of area
      public double circum(double r){
         return 3.14*r*r;//multiplies pi by radius square
   }//end of circum
} // end of class

/*
output:
  ----jGRASP exec: java Unit5Area
 Enter the radius: 
 12
 Area of Circle: 452.15999999999997
 
  ----jGRASP: operation complete.
*/