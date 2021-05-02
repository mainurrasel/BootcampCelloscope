package beginningJava;
import java.io.IOException;

public class AverageFruit {
    public static void main(String[] args){
        double numOranges = 5.0;
        double numApples = 10.0;
        double averageFruit = 0;
        averageFruit = (numOranges+numApples)/2;
        System.out.println("Average fruit is:"+averageFruit);
        System.out.println("Enter key to exit");
        try{
            System.in.read();

        }
        catch (IOException e){
            return;
        }
    }
}
