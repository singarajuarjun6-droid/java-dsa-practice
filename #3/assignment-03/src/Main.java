import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //enter the length and bredth
        System.out.println("enter the lenght and bredth :");
        int l = input.nextInt();
        int b = input.nextInt();

        if(l==b){
            System.out.println(" not a rectangle ");
        }
        else{
            System.out.println("area : "+(l*b));
        }
    }
}