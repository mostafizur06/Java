
package java_basic;

import java.util.Scanner;


public class Max {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a, b, c;
        System.out.print("Enter the value of a: ");
       a=input.nextInt();
        System.out.print("Enter the value of b: ");
       b=input.nextInt();
        System.out.print("Enter the value of c: ");
       c=input.nextInt();
       
       if(a>b && a>c)
       {
           System.out.println("Maximum Value = "+a); 
       }
      else if(b>a && b>c)
       {
           System.out.println("Maximum Value = "+b); 
       }
else if(c>a && c>a)
       {
           System.out.println("Maximum Value = "+c); 
       } 
       
else{
           System.out.println("<<a, b, c are same>>");
}  
     
       
       
       }      
       
       
    }
    
    

