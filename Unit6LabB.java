//assignment info:  Write a Java application for a gradebook using arrays:
//name: said ahmed
//date: 23 june 2018

import java.util.Random;
import java.util.Scanner;

public class Unit6LabB {
    public static void main(String args[]){
        int arr[] = new int[20];
        Random random = new Random();
        for(int i = 0;i<20;i++){
            arr[i] = random.nextInt(100)+1;
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Minimum = " + Lowest(arr));
        System.out.println("Maximum = " + Highest(arr));
        System.out.println("Sum = " + Total(arr));
        System.out.println("Average = " + Average(arr));
    } // end main
    
    public static int Lowest(int[] numbers){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if(min > numbers[i]){
                min = numbers[i];
            }//end if
        }//end for
        return min;
    }//end method

    public static int Highest(int[] numbers){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if(max < numbers[i]){
                max = numbers[i];
            }//end if
        }//end for
        return max;
    }//end method

    public static int Total(int[] arrx){
        int sum = 0;
        for(int i = 0;i<arrx.length;i++){
            if((arrx[i] & 2) > 0 || ((arrx[i] & 4) > 0) || ((arrx[i] & 8) > 0)){
                sum += arrx[i];
            }//end if
        }//end for
        return sum;
    }//end method

    public static double Average(int arr[]){
        return 1.0 * Total(arr)/arr.length;
    }//end method
} // end class

/*
sample output: 

  ----jGRASP exec: java Unit6LabB
 31 1 92 25 85 36 67 35 24 46 28 53 30 90 49 64 89 83 23 92 
 Minimum = 1
 Maximum = 92
 Sum = 929
 Average = 46.45
 
  ----jGRASP: operation complete.
*/ 