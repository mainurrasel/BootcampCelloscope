package beginningJava;

public class MatchStrings2 {
    public static void main(String[] args) {
        String string1 = "Too many";
        String string2 = "cooks";
        String string3 = "Too many cooks";
        string1 += string2;
        System.out.println("Test 1");
        System.out.println("string3 is now: " + string3);
        System.out.println("string1 is now: " + string1);
        if(string1.equals(string3)) {
            System.out.println("string1.equals(string3) is true." +" so strings are equal.");
        } else {
            System.out.println("string1.equals(string3) is false." +"so strings are not equal.");
        }
        string3 = "TOO many cooks";
        System.out.println("\nTest 2");
        System.out.println("string3 is now: " + string3);
        System.out.println("string1 is now: " + string1);
        if(string1.equals(string3)) {
            System.out.println("string1.equals(string3) is true " + "so strings are equal.");
        } else {
            System.out.println("string1.equals(string3) is false" + "so strings are not equal.");
        }
        if(string1.equalsIgnoreCase(string3)) {
            System.out.println("string1.equalsIgnoreCase(string3) is true" + "so strings are equal ignoring case.");
        } else {
            System.out.println("string1.equalsIgnoreCase(string3) is false" +"so strings are different.");
        }
    }
}
