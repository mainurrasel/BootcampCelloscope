package beginningJava;

public class LetterCheck {
    public static void main(String[] args) {
        char symbol = 'A';
        symbol = (char)(128.0*Math.random());

        if(symbol >= 'A') {

            if(symbol <= 'Z') {
                System.out.println("You have the capital letter " + symbol);
            } else {
                if(symbol >= 'a') {
                    if(symbol <= 'z') {
                        System.out.println("You have the small letter " + symbol);
                    } else {
                        System.out.println(
                                "The code is greater than a but it’s not a letter");
                    }
                } else {
                    System.out.println(
                            "The code is less than a and it’s not a letter");
                }
            }
        } else {
            System.out.println("The code is less than A so it’s not a letter");
        }
    }
}