package exam;

public class Quiz14 {
    public static void main(String[] args) {
        final int iLoc = 3;
        Integer iRef = 5;
        switch (iRef) {
            default:
                System.out.println("You are OK.");
            case 1:
            case iLoc:
            case 2 * iLoc:
                System.out.println("I am not OK.");
                break;
            case 4:
                System.out.println("It's OK.");
        }
    }

}
