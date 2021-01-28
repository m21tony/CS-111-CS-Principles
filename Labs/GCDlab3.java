// Antonio Maldonado
// September 02 2016

// This code demonstrates the greatest common divisor algorithm
// It shows how to calculate the remainder of two integers and also
// how a while loop works with a counting variable


import java.util.Scanner;

class GCD {
 
    public static void main(String[] args) {
       int A;
       int B;
       int R;
       
       Scanner input = new Scanner( System.in );
       
       R=0;
       
       System.out.println(" Input a number ");
       A = input.nextInt();
       
       System.out.println(" Input a number ");
       B = input.nextInt();
             
       while (B > 0)
         {
          R=A%B;
          A=B;
          B=R;
          
         }
       
      System.out.println("And finally A has the value of  " + A);
       

     }// of main
} // of class GCD