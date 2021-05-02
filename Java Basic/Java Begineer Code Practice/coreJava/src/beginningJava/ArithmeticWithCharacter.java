package beginningJava;

public class ArithmeticWithCharacter {
    public static void main(String [] args){
        char letter1 ='A';
        char letter2 = 'B';
        char letter3 = letter2;

        System.out.println("Here's a sequence of letters: "+ letter1+letter2+(++letter3));
        System.out.println("Here are the decimal codes for the letters:\n"+
                      letter1 + ": " + (int)letter1 +
                " " + letter2 + ": " + (int)letter2 +
                " " + letter3 + ": " + (int)letter3);
    }
}
