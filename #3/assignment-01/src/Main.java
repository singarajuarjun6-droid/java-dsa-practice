
import java.util.Scanner;

public class Main{
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the radius");
        int radius = input.nextInt();
        int x = (radius*radius);
        double area = (float) (x)*3.14;


        System.out.println("area :"+ area);
    }
}