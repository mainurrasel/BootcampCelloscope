package coreJava;

public class JavaIfElse {
    public static void main(String[]args){
        int x =50;
        int y = 50;
        if (x==y){
            System.out.println("1");
        }else if(x>y){
            System.out.println("2");
        }else{
            System.out.println("3");
        }
        int time = 20;
        String result = (time <18)?"Good Day":"Good Evening";
        System.out.println(result);
    }
}
