
import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("yes it is even");
        }
        else{
            System.out.println("nooo");
        }

    }
}