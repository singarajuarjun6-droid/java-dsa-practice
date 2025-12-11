import java.util.Scanner;

public class Main{
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the base and height of triangle :");
        int b = input.nextInt();
        int h = input.nextInt();

        double area = 0.5*b*h;

        System.out.println("area is : "+area);
    }
}