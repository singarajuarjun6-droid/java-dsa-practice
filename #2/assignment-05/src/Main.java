import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner input = new Scanner(System.in);
        System.out.println("enter the two numbers");

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if(n1>=n2){
            System.out.println("num1 is big : "+n1);
        }
        else{
            System.out.println("num2 is big : "+n2);
        }
    }
}