package datatype;

import java.io.PrintStream;

public class FormatSpecifier {
    public static void main(String []args){
    boolean b = true;
    double d = 10.2;
    char c ='a';
    short s= 237;
    int i = 2; //Dynamic

    System.out.printf("boolean b = %b\n",b);
    System.out.printf("Character c = %c\n",c);
    System.out.printf("int i = %d\n",i);
    System.out.printf("short s = %d\n",s);
    System.out.printf("double c = %.2f\n",d);


    }
}
