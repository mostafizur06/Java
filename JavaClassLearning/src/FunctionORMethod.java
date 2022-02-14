
import java.util.Scanner;

public class FunctionORMethod {

    public static int calculator(int a, int b)
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
      
       int result = calculator(x, y);
       
        System.out.println("Maximum is: "+result);
    }
   
}
