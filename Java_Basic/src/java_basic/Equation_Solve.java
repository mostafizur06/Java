package java_basic;

import java.util.Scanner;

public class Equation_Solve {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("a. A*B - C*D \nb. 2A - B + 3D \nc. A^2 + B^2 - C^2 +D^2 \nd. A^3 - B + C^2");

        System.out.println("\nEnter the value of A, B, C, D: ");
        System.out.println("------------------------------");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        int result1 = ((a * b) - (c * d));

        int result2 = ((2 * a) - b + (3 * d));

        int result3 = ((a * a) + (b * b) - (c * c) + (d * d));

        int result4 = ((a * a * a) + b - (c * c));
        System.out.println("\nSolution of Equation - 1 = " +result1);
        System.out.println("Solution of Equation - 2 = " +result2);
        System.out.println("Solution of Equation - 3 = " +result3);
        System.out.println("Solution of Equation - 4 = " +result4);

    }

}
