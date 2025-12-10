import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String in = input.next();

        int i = 0;
        int j = in.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (in.charAt(i) != in.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("PALINDROM");
        } else {
            System.out.println("NO");
        }
    }
}
