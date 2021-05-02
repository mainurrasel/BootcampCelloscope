package com.arnabb;

class OuterClass {

    public static void show()

    {
        System.out.println("This method from OuterClass");
    }

    // member class
    class InnerClass1 // OuterClass$InnerClass2.class
    {
        public void display() {
            System.out.println("This method from InnerClass 1");
        }
    }

    // static class
    static class InnerClass2 // OuterClass$InnerClass2.class
    {
        public void display() {
            System.out.println("This method from InnerClass 2");
        }
    }
}


public class InnerClassDemo {

    public static void main(String[] args){
        OuterClass outerObj = new OuterClass();
        OuterClass.show();

        // non-static class have to call by the Class Object
        OuterClass.InnerClass1 innerObj1 = outerObj.new InnerClass1();
        innerObj1.display();

        // static class can be directly called by the Class name
        OuterClass.InnerClass2 innerObj2 = new OuterClass.InnerClass2();
        innerObj2.display();
    }
}


