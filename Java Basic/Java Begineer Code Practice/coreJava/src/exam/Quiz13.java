package exam;

public class Quiz13 {
    public static void main(String[] args) {
        final int iLoc = 3;
        switch (6) {
            case 1:
            case iLoc:
            case 2 * iLoc:
                System.out.println("I am not OK.");
            default:
                System.out.println("You are OK.");
            case 4:
                System.out.println("It's OK.");
        }
    }
}
