import java.util.Scanner;

public class Operators
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name ");
        String firstName=input.nextLine();
        System.out.println("Please enter your last name ");
        String lastName= input.nextLine();
        String fullName;

        System.out.println("Please enter value of x ");
        int x=input.nextInt();
        System.out.println("Please enter value of y ");
        int y=input.nextInt();
        int result;

        input.close();

        fullName = firstName + " " + lastName;
        result = x + y;

        System.out.println("Adding strings: " + fullName);
        System.out.println("Adding integers: " + result);
    }
}