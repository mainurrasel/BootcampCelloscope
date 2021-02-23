package javabeginner;
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, large;
        System.out.print("Enter N1:");
        num1 = input.nextInt();
        System.out.print("Enter n2:");
        num2 = input.nextInt();

        large = (num1 > num2 ? num1 : num2);
        System.out.print("Large number is:" + large);
    }
}
