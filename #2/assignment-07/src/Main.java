//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Main{
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the number till fibonaci :");
        int num = input.nextInt();

        int n1 = 0;
        int n2 = 1;

        for(int i = 0;i<num;i++){

            int n3 = n1+n2;
            System.out.println("out : "+n3);
            n1 = n2 ;
            n2 = n3 ;

        }
    }
}
