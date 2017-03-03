import java.util.ArrayList;
/**
 * Created by glars on 6/16/2016.
 */
public class PrimeList {
    ArrayList<Integer> primes;
    int operations;

    public PrimeList() {
        primes = new ArrayList<>();
        operations = 0;
    }

    /**
     * Checks for primes and adds them to list
     * @param numbers to be parsed
     */
    public void add(int[] numbers) {
        if (numbers == null) {
            throw new java.lang.IllegalArgumentException("Data is null");
        }
//        for every number check if prime
        for (int i: numbers) {
            if (checkPrime(i)) {
//                Uncommenting this prints out every prime number
//                System.out.println(i);
                primes.add(i);
            }
        }
    }

    /**
     * Checks if number is prime
     * @param number to be checked
     * @return true if prime, false if composite
     */
    public boolean checkPrime(int number) {
        int maxPossibleRoot = (int) Math.sqrt(number);
        for (int i = 1; i < maxPossibleRoot; i++) {
            operations++;
            if (number % primes.get(i - 1) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculates time complexity of operations
     * @return x, where O(n^x)
     */
    public double timeComplexity() {
        double n = operations / primes.size();
        return Math.log(operations) / Math.log(n);
    }

    public String toString() {
        return primes.get(primes.size() - 1).toString();
    }
}
