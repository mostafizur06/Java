
package java_basic;

import java.util.Scanner;


public class checking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Mark: ");
        int a= input.nextInt();
        if(a <= 100 && a>=80)
        {
            System.out.println("Grade: A+\nGrade point: 4.00\nRemark: Outstanding");
        }
        
        else if(a<80 && a>=75)
        {
            System.out.println("Grade: A\nGrade point: 4.75\nRemark: Excellent");
        }
        
        else if(a<75 && a>=70)
        {
            System.out.println("Grade: A-\nGrade point: 4.50\nRemark: Very Good");
        }
        
        else if(a<70 && a>=65)
        {
            System.out.println("Grade: B+\nGrade point: 3.25\nRemark: Good");
        }
        
        else if(a<65 && a>=60)
        {
            System.out.println("Grade: B\nGrade point: 3.00\nRemark: Satisfy");
        }
        
        else if(a<60 && a>=55)
        {
            System.out.println("Grade: B-\nGrade point: 2.75\nRemark: Abode Avergae");
        }
        
         else if(a<=60)
        {
            System.out.println("Grade: F\nGrade point: 0.00\nRemark: Fail");
        }
        else
             System.out.println("");
        
        
        
      
    }
    
    
}
