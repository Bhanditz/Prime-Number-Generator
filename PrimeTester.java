/**
 * Created by glars on 6/16/2016.
 */
public class PrimeTester {

    public static void main(String[] args) {
        // the range of numbers to be checked; can be edited
        int maxNumber = 10000000;
        PrimeList p = new PrimeList();
        int[] n = new int[maxNumber - 1];
        for (int i = 0; i <= maxNumber - 2; i++) {
            n[i] = i + 2;
        }
        p.add(n);
        System.out.println("Largest Prime in " + maxNumber + ": " + p);
        System.out.println("Time Complexity: O(n^" + p.timeComplexity() + ")");

    }
}
