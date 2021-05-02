package beginningJava;
import java.io.IOException;

public class Fruit {
    public static void main(String[] args) {
// Declare and initialize three variables
        int numOranges = 5;
// Count of oranges
        int numApples = 10;
// Count of apples
        int numFruit = 0;
// Count of fruit
        numFruit = numOranges + numApples;
// Calculate the total fruit count
// Display the result
        System.out.println("A totally fruity program");
        System.out.println("Total fruit is " + numFruit);
        System.out.println("Enter to Exit");
        try {
            System.in.read();

        } catch (IOException e) {
            return;
        }
    }
}
