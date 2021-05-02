package exception_handling;

import java.util.Scanner;

public class ProblemDemo {
    public static void main(String []args) {
         int count = 1;
         do {
             try {
                 Scanner input = new Scanner(System.in);
                 System.out.print("Enter num 1:");
                 int num1 = input.nextInt();
                 System.out.print("Enter num 2:");
                 int num2 = input.nextInt();
                 int result = num1 / num2;
                 System.out.println("Result:" + result);
                 count = 2;
             } catch (Exception e) {
                 System.out.println(e);
             }
             }
             while (count == 1) ;
    }
}
