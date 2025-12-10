import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        System.out.println("enter two numbers for operations");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("choose the following operations :");
        System.out.println("1.+\n2.-\n3./\n4.*\n");
        int choice = input.nextInt();

        if(choice==1){
            int sum = num1+num2;
            System.out.println("->"+sum);
        } else if (choice==2) {
            int sum = num1-num2;
            System.out.println("->"+sum);
        } else if (choice==3) {
            int sum = num1/num2;
            System.out.println("->"+sum);
        } else if (choice==4) {
            int sum = num1*num2;
            System.out.println("->"+sum);
        }
        else{
            System.out.println("INVALID INPUT");
        }
    }
}