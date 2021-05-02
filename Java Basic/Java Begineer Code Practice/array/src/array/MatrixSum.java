package array;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        System.out.println("Enter numbers for matrix A:");
        for(int row = 0;row<2;row++){
            for(int col =0;col<3;col++){
                System.out.printf("A[%d][%d]:",row,col);
                A[row][col]= input.nextInt();
            }
        }

        System.out.println("Enter numbers for matrix B:");
        for(int row = 0;row<2;row++){
            for(int col =0;col<3;col++){
                System.out.printf("A[%d][%d]:",row,col);
                B[row][col]= input.nextInt();
            }
        }
        System.out.println("A=");
        for(int row = 0;row<2;row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+A[row][col]);
            }System.out.println();
        }
        System.out.println();
        System.out.println("B=");
        for(int row = 0;row<2;row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+B[row][col]);
            }System.out.println();
        }
        System.out.println("Sum of Matrix A & Matrix B:");

        for(int row = 0;row<2;row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t"+(A[row][col]+B[row][col]));
            }System.out.println();
        }
    }
}
