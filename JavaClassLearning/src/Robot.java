
import java.util.Scanner;

public class Robot {

    public int hand;
    public String color;

    public void GetInput() //////Method//////
    //access_Modifier Retrun_Type Method_name (Parameter/Argument)//
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Hand: ");
        hand = input.nextInt();
        input.nextLine();
        System.out.print("Enter Color: ");
        color = input.nextLine();
    }

    public void display()
    {
        System.out.println("Hands: " + hand);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) 
    {
        Robot r1 = new Robot(); ////Object Create////
//Class_Name object_name = new Default_Constructor/Class_Name//
        r1.GetInput();
        r1.display();
    }
}
