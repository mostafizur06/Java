package lab_3;

import java.util.Arrays;
import java.util.Scanner;

public class Shorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("How many Numbers you want to insert?");
        x = input.nextInt();

        System.out.print("Enter " + x + " array elements: ");

        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        for (int a : arr) {
            System.out.print(a + "  ");
        }

    }

}
