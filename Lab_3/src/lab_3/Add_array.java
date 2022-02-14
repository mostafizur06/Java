package lab_3;

import java.util.Scanner;


public class Add_array {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        int i ,j;
        System.out.print("How many elements in First array: ");
        a = input.nextInt();
        int [] arr1 = new int[a];
        for (i=0; i<a; i++) {
            arr1[i] = input.nextInt();
            
        }
        
        System.out.print("How many elements in Second array: ");
        b = input.nextInt();
       int [] arr2 = new int[b];
        for (i=0; i<b ; i++) {
            arr2[i] = input.nextInt();
        }
        
        int c = a+b;
        int[]arr3 = new int[c];
        for (i=0; i<a; i++) {
            
           arr3[i] = arr1[i] ;   
        }
        for (i=0, j=a ; i<b && j<c; i++, j++) {
            
        arr3[j] = arr2[i];    
        }
        for (i = 0; i<(a+b); i++) {
          
            System.out.print(arr3[i]+" ");
        }
     
    }
    
}
