import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name of the user");
        String name = input.nextLine();
        System.out.println("hello "+ name+" how are u ?");

    }
}