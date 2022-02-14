package lab_3;

import java.util.Arrays;
import java.util.Scanner;

public class CGPA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("How many Studetns’ CGPA you want to insert?");
        x = input.nextInt();

        System.out.print("Enter " +x+ " array elements: ");

        double[] arr = new double[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextDouble();
        }

        double large = arr[0];
        double small = arr[0];
        for (int i = 1; i < x; i++) {
            if (arr[i] > arr[0]) {
                large = arr[i];
            }

            if (arr[i] < arr[0]) {
                small = arr[i];
            }
        }
        System.out.println("Largest CGPA = " + large);
        System.out.println("Small CGPA = " + small);

//        Arrays.sort(arr);
//        System.out.println("Largest CGPA = " + arr[x - 1]);
//        System.out.println("Smallest CGPA = " + arr[0]);

    }
}
