package javabeginner;

import java.util.Scanner;

public class If {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter n:");
        n= input.nextInt();
        if(n>6) {
            System.out.print("ok");}
        else if(n==6){
            System.out.print("equal");
        }
        else {
            System.out.print("Not ok");
        }
    }
}
