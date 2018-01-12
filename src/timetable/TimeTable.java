/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

/**
 *
 * @author Dell
 */
public class TimeTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int size = 9;    // size of the board
       
         for (int row = 1; row <= size; ++row) {  // Use row and col, NOT i and j, or x and y
         
           for (int col = 1; col<=size; ++col) {
           int product;
           product=row*col;
           System.out.printf("%3d",product);   // print the numbers in appropriate format
          }
        System.out.println();     // print a newline
      } 
    }
    
}
