package exam;

public class Quiz26 {
    public static void main(String[] args) {
        for (Character cRef = 'A'; cRef < 'F'; cRef++)
            switch(cRef) {
                default: System.out.print((char)('a' + cRef - 'A')); break;
                case 'B': System.out.print(cRef); break;
                case 68: System.out.print(cRef); // 68 == 'D'
            }
    }
}
