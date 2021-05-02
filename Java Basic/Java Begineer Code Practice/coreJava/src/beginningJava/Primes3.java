package beginningJava;

public class Primes3 {
    public static void main(String[] args) {
        int nPrimes = 50;
        OuterLoop:
        for(int i = 2 ; ; ++i) {// This loop runs forever
            // Try dividing by all integers from 2 to i-1
            for(int j = 2; j < i; ++j) {
                if(i % j == 0) {// This is true if j divides exactly
                    continue OuterLoop;// exit the loop
                }
            }
            System.out.println(i);
            if(--nPrimes == 0) {// Decrement the prime count
                break;// It is zero so we have them all
            }
        }
    }
}