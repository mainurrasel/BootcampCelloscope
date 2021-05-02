package coreJava;

public class JavaSwitch {
    public static void main(String[] args){
        int day = 2;
        switch (day) {

           case 1:
            System.out.println("Saturday");
            break;

            case 2:
            System.out.println("Sunday");
            break;
        }
        int night =4;
        switch (night){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("monday");
        }
    }
}
