package javabeginner;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 ,n2, result;
        System.out.print("Enter N1:");
        n1=input.nextInt();
        System.out.print("Enter n2:");
        n2=input.nextInt();

        result= n1+n2;
        System.out.print("Sum ="+result);



    }
}
