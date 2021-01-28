// Antonio Maldonado, September 16, 2016

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Lab5 {
 
    public static void main(String[] args) {

        List L = new ArrayList();
        Scanner input = new Scanner( System.in );
        
        int n=-1;
        
        while (n != 0)
         { System.out.print("Please give me a number (0 to quit) ");
            n = input.nextInt();
            L.add(n);
          }
        
        Collections.sort(L);

        printme(L); // calls the function printme  
   
        Collections.sort(L,Collections.reverseOrder());
        
        printme(L); // calls the function printme
        
   
     }// of main
     
     private static void printme(List A)
       { 
         for (int i=0;i<A.size(); i++) //prints out each element of the list with space in between
         { System.out.print(" " + A.get(i));
          }
           System.out.println();
         
       } // end of printme
} // of Lab5