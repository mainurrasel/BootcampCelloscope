package javabeginner;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args){
        //Input Int
        Scanner input= new Scanner(System.in);
        int number;
        System.out.print("Enter A number:");
        number=input.nextInt();
        System.out.println("Input is:"+number);
        //Input String
        Scanner name= new Scanner(System.in);
        String n;
        System.out.print("Enter Name:");
        n=name.nextLine();
        System.out.println("Your name is:"+n);

        //Input double
        Scanner weight= new Scanner(System.in);
        double m;
        System.out.print("Enter weight:");
        m=weight.nextDouble();
        System.out.println("Your weight is:"+m);

    }
}
