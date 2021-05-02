package beginningJava;

public class SequenceStrings {
    public static void main(String[] args) {
        String string1 ="A";
        String string2 ="To";
        String string3 ="Z";

        String string1Out = "\"" + string1 + "\"";
        String string2Out = "\"" + string2 + "\"";
        String string3Out = "\"" + string3 + "\"";

        int result = string1.compareTo(string3);
        if(result < 0) {
            System.out.println(string1Out +  "is less than " + string3Out);
        } else if(result > 0) {
            System.out.println(string1Out + "is greater than " + string3Out);
        } else {
            System.out.println(string1Out + "is equal to" + string3Out);
        }
        result = string2.compareTo(string1);
        if(result < 0) {
            System.out.println(string2Out + "is less than" + string1Out);
        } else if(result > 0) {
            System.out.println(string2Out + "is greater than" + string1Out);
        } else {
            System.out.println(string2Out +  "is equal to" + string1Out);
        }
    }
}
