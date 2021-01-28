// Antonio Maldonado
// September 30, 2016
// Taking (inputting numbers) and calculating the sum and average while sorting them in ascending order

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner; // load the scanner utility

class Lab7 {
 
    public static void main(String[] args) {

        double n;
        double sum;
        
        Scanner input = new Scanner( System.in );  //define the scanner
         
        List L = new ArrayList();
       
        n=1.0;
        // read in the floats
        while ( n != 0.0 )
          {
             System.out.println("Please input a numner");
             n = input.nextDouble();
             if ( n != 0.0) L.add(n);
             System.out.println("read in " + n);
          
          }
          Collections.sort(L); // Sorting in ascending order
          sum = 0;
        for (int i=0; i< L.size(); i= i+1)
         {
           sum = sum + (double)L.get(i);
           System.out.println(i+1 + " " + L.get(i));
         }
               
         System.out.println("SUM: " + sum); // Calculating Sum
         System.out.println("AVERAGE: " + (sum/L.size())); // Calculating Average    
   
     }// of main
     
   } // of Lab7