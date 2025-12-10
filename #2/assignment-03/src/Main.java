
import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the values of ptr");
        int p = input.nextInt();
        int t = input.nextInt();
        int r = input.nextInt();

        float si = (float)((p*t*r)/100);

        System.out.println("simple intrest : "+ si);
    }
}