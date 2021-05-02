package coreJava;

public class JavaArrays {
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford"};
        System.out.println(cars[1]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
        for (String i: cars){
            System.out.println(i);
        }
       int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    }
}
