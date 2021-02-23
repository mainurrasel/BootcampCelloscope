package javabeginner;

import java.util.Scanner;

public class Character {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char n;
        System.out.print("Enter a character:");
        n = input.next().charAt(0); // charAt(index) is for taking character from a string
        //With or operator
        if (n == 'a' || n=='e' || n=='i'|| n=='o' || n=='u'|| n == 'A' || n=='E' || n=='I'|| n=='O' || n=='U'){
            System.out.print("Vowel\n");
        }
        else {
            System.out.print("Consonant\n");
        }
        //and operator
        if (n >= 'a' && n<= 'z'){
            System.out.print("small latter");
        }
        else{
            System.out.print("capital latter");
        }

    }
}
