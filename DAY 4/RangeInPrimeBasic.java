import java.util.Scanner;

public class RangeInPrimeBasic {

    // Check if a number is prime using basic method
    public static boolean isPrime(int x) {
        if (x < 2) return false; // 0 and 1 are not prime
        for (int i = 2; i < x; i++) { // check all numbers less than x
            if (x % i == 0) {
                return false; // found a factor, not prime
            }
        }
        return true; // no factors, it's prime
    }

    // Print all prime numbers from 2 to n
    public static void PrimeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        long startTime = System.currentTimeMillis(); // Start timer

        PrimeRange(n);

        long endTime = System.currentTimeMillis(); // End timer

        long totalTime = endTime - startTime;

        System.out.println("⏱️ Time taken: " + totalTime + " ms");

        sc.close();
    }
}
