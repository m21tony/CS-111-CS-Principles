// Antonio Maldonado 09-23-16
// CS 111
// example of definite loops
// This code allows you to input a number (n) and input a stride (k) and count up to n using k stride
// Then, I modified the code so that the output creates 2 columns.  This means I had to use two "for" loops

import java.util.Scanner;


class Lab6 {
 
    public static void main(String[] args) {

         int n;
         int k;
         
         Scanner input = new Scanner( System.in );
       
         System.out.println(" Input a number ");
         n = input.nextInt();
         
         System.out.println(" Input the stride ");
         k = input.nextInt();
         
         for(int i=1; i<n; i=i+k)
          for(int z=1; z<n; z=z+k)
          {
            System.out.println(i + " " + z);
          }
   
     }// of main
     
} // of Lab6