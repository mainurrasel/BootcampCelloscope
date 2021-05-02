package coreJava;

public class JavaLoops {
    public static void main(String[] args){
        int i = 1;
        while (i < 6) {
            System.out.println(i);
            i++;
            ;
        }
        int j =1;
        do{
            System.out.println(j);
            j++;
        }
        while (j<6);


        for(int x=0;x<5;x++) System.out.println(x);
        String[]cars = {"Volvo","BMW","Ford"};
        for (String k : cars){
            System.out.println(k);
        }
        for (int a=1;a<5;a++){
            if(a==3){
                //break;
                continue;
            }
            System.out.print(a);

        }
    }
}
