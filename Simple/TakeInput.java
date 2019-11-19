import java.util.Scanner;

public class TakeInput{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your username : ");

        String userName = myObj.nextLine();
        System.out.println("The user name is "+userName);

    }
}