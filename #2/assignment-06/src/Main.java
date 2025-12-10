import java.util.Scanner;

public class Main{
    static void main(String[] args) {

        System.out.println("enter the amount in ruppees :");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        double num2 = num*0.01;

        System.out.println("converted is : "+num2);
    }
}