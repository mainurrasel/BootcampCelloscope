package w3resource;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number:");
        int num2 = input.nextInt();
        int output = num1* num2;
        System.out.print(num1+"*"+num2+"="+output);
    }
}
