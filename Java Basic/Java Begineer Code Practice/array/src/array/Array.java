package array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num [] = new int [5];
        System.out.println("Enter 5 numbers:");
        int sum = 0;
        //num[0] =10;
        //num[1] = 5;

        for(int i = 0; i<num.length; i++){
            num[i]= input.nextInt();
        }
        for(int i = 0; i<num.length; i++){
            sum = sum +num[i];
        }
        //num[0]=input.nextInt();
        //num[1]=input.nextInt();
        //num[2]=input.nextInt();
        //num[3]=input.nextInt();
        //num[4]=input.nextInt();

        //int sum = num [0]+num [1]+num [2]+num [3]+num [4];

        System.out.println("Sum of 5 numbers:"+sum);

        int len = num.length;
        System.out.println("Length of the array is:"+len);
        int max = num[0];
        for(int i= 1; i <num.length;i++){
            if (max<i){
                max= num[i];
            }
        }System.out.println("Max:"+max);
    }
}
