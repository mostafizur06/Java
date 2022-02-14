
package java_basic;

import java.util.Scanner;


public class User_Input {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        String name;
        int age;
        double cgpa;
        String dep;
        char sec;
        System.out.print("Enter Your Name: ");
        name = input.nextLine();
        System.out.print("Enter Your Age: ");
        age = input.nextInt();
        System.out.print("Enter Your CGPA: ");
        cgpa = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Your Department: ");
        dep = input.nextLine();
        
        System.out.print("Enter Your Sec: ");
        sec = input.next().charAt(0);
       
        System.out.println("\n\n\tYour Details");
        System.out.println("------------------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+cgpa);
       
        System.out.println("Department: "+dep);
        
        System.out.println("SEC: "+sec);
         System.out.println("------------------------------");
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
