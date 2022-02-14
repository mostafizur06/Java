package lab_3;

import java.util.Scanner;

public class are_of_circle {

    public  double redius(double a) {
        double area = Math.PI * Math.pow(a, 2);
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double r;
        System.out.print("Enter the value of redius: ");
        r = input.nextDouble();
         are_of_circle m = new are_of_circle();
        double result = m.redius(r);

        System.out.format("Area is %.3f", result);
         System.out.println("\n"); 
    }

}
