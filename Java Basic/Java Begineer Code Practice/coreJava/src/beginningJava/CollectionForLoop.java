package beginningJava;

public class CollectionForLoop {
    enum Season { spring, summer, fall, winter }
    public static void main(String[] args) {
        for(Season season : Season.values()) {      // Vary over all values
            System.out.println(" The season is now " + season);
        }
    }
}
