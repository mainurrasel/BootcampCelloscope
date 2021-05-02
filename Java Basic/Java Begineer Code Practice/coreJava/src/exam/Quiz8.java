package exam;

public class Quiz8 {
    public static void main(String[] args) {
        int i = 0;
        int[] a = {3,6};
        a[i] = i = 9;
        System.out.println(i + " " + a[0] + " " + a[1]);
    }
}
