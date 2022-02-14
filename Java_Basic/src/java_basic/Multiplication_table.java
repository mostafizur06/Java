
package java_basic;

import java.util.Scanner;


public class Multiplication_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = input.nextInt();
         int res;
        for (int i = 1; i <= 10; i++) {
         
         res = i*a;
            System.out.println(" "+a+" X "+i+" = "+res);
         
                
        }
        
        
    }
}
