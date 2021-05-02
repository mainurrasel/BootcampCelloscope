package coreJava;

import java.util.Locale;

public class JavaString {
    public static void main(String[] args){
        String greeting = "Hello";
        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase());
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName+lastName);
        System.out.println(firstName.concat(lastName));
        System.out.print(firstName.indexOf("n"));

    }
}
