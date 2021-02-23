package javabeginner;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);
        int n;
        System.out.print("Enter a digit:");
        n= input.nextInt();
        switch(n) {
            case (0): {
                System.out.print("Zero");
                break;
            }
            case (1): {
                System.out.print("One");
                break;
            }
            case (2): {
                System.out.print("Two");
                break;
            }
            case (3): {
                System.out.print("Three");
                break;
            }
            case (4): {
                System.out.print("Four");
                break;
            }
            case (5): {
                System.out.print("Five");
                break;
            }
            default: {
                System.out.print("Not a proper digit");
            }
        }
    }
}
