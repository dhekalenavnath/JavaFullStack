import java.util.Scanner;

public class RangeinPrimeOPtimized {
    


    public static boolean isPrime(int x){
         if (x < 2) return false; // 0 and 1 are not prime
            if (x == 2) return true; // 2 is the only even prime number
            if(x%2==0) return false; // other even numbers are not prime
            // check for factors from 3 to sqrt(x)
       for(int i=3;i*i<=x;i++){
         if(x%i==0){
            return false;
        }
    }
        return true; // if no divisors found, it's prime
    }
    public static void PrimeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        long start = System.nanoTime(); // Start time in nanoseconds
    PrimeRange(n); // Call your function
    long end = System.nanoTime(); // End time
    long duration = end - start;
    System.out.println("Time taken: " + duration + " nanoseconds");
    System.out.println("⏱️ Time taken: " + (duration / 1_000_000.0) + " milliseconds");
    }
        
}
