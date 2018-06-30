//assignment: Write a program to make an array so that the size of the array is specified by the first command-line argument. If no command-line argument is supplied, use 10 as the default size of the array. Print all elements of the array. (Refer to  Addition.java  )
//name: said ahmed
//date: 23 june 2018

import java.util.Random;

public class Unit6LabA {
    public static void main(String[] args) {
        
        int size = 10;
        if(args.length > 0) {
            size = Integer.parseInt(args[0]);
        }//end of if
        
        int[] array = new int[size];
        Random random = new Random();
        
        for(int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(101);
        }//end of for
        
        System.out.print("Array is ");
        
        for(int i = 0; i < array.length; ++i) {
            
            System.out.print(array[i] + " ");
        }//end of for
        
        System.out.println();
    }//end of main

}// end of class

/*
sample output: 
  ----jGRASP exec: java Unit6LabA
 Array is 1 23 78 18 8 19 72 72 0 74 
 
  ----jGRASP: operation complete.
*/ 

