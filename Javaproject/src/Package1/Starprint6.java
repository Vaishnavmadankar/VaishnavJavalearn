package Package1;

import java.io.*;

//Java code to demonstrate star pattern
public class Starprint6

{
 // Function to demonstrate printing pattern
 public static void main(String[] args) 
 {
     // outer loop to handle number of rows
     //  n in this case
     for (int i=0; i<5; i++)
     {

         // inner loop to handle number spaces
         // values changing acc. to requirement
         for (int j=5-i; j>1; j--)
         {
             // printing spaces
             System.out.print(" ");
         }

         //  inner loop to handle number of columns
         //  values changing acc. to outer loop
         for (int j=0; j<=i; j++ )
         {
             // printing stars
             System.out.print("* ");
         }

         // ending line after each row
         System.out.println();
     }
 }
   
 
}