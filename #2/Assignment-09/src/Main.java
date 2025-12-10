import java.util.Scanner;
import java.lang.Math;

public class Main{
    static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String num = input.next();
    int count = num.length();
    int sum=0;
    for(int i=0;i<count;i++){
        int x = Math.powExact(Character.getNumericValue(num.charAt(i)),count);
        sum=sum+x;
        System.out.println(sum);
    }
    String summ = String.valueOf(num);
    if(summ==num){
        System.out.println("yessss");
    }
    else{
        System.out.println("nooo");
    }
    }
}