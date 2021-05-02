package com.arnabb;

public class Greeter {

    // classic OOP
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        Greeting myLambdaFunction = () -> System.out.println("Hello!");

        greeter.greet(myLambdaFunction);
    }
}

