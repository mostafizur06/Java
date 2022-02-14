
package lab_3;

import java.util.Scanner;

public class max {
    
    public static int maxValue(int a, int b)
    { 
    int max = Math.max(a, b);
    return max; 
    }
      
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Enter X: ");
        x = input.nextInt();
        System.out.print("Enter Y: ");
        y = input.nextInt();
      
       int result = maxValue(x, y);
       
        System.out.println("Maximum Value is: "+result);
    }
   

}
