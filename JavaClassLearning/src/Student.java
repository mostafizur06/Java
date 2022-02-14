
import java.util.Scanner;

public class Student {

    private String name;
    private int id;
    private double cgpa;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student X = new Student();
        
        System.out.print("Enter the Name of X: ");
        X.name = input.nextLine();     
        System.out.print("Enter the ID of X: ");
        X.id = input.nextInt();        
        System.out.print("Enter the CGPA of X: ");
        X.cgpa = input.nextDouble();
        
   
        Student Y = new Student();
        input.nextLine();
        System.out.println("\n");
        System.out.print("Enter the Name of Y: ");
        Y.name = input.nextLine();
        System.out.print("Enter the ID of Y: ");
        Y.id = input.nextInt();
        System.out.print("Enter the CGPA of Y: ");
        Y.cgpa = input.nextDouble();

        System.out.println("\nInformation of X\n----------------------");
        System.out.println("Name: "+X.name+"\nID: "+X.id+"\nCGPA: "+X.cgpa);
        
        System.out.println("\nInformation of Y\n----------------------");
        System.out.println("Name: "+Y.name+"\nID: "+Y.id+"\nCGPA: "+Y.cgpa);
        
        
        
        
        
        
        

    }

}
