
import java.util.Scanner;

public class Person {

    public String name;
    public int age;

    public void insertValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
       
        name = input.nextLine();
        System.out.print("Enter age: ");
        age = input.nextInt();

    }

    public void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Person P1 = new Person();

        Person P2 = new Person();

        P1.insertValue();
        P1.display();

    }

}
