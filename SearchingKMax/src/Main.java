import java.util.Arrays;
import java.util.Random;

public class Main {
    public static final int NUM_OF_K = 4;
    public static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {

        int[] maxs = new int[NUM_OF_K];
        int[] array = new int[ARRAY_SIZE];
        System.out.println("Array: ");
        fillArray(array);

        // Naive implementation
        System.out.println("\n-------- Native implementation --------");
        long startTime = System.nanoTime();
        naiveImplementation(Arrays.copyOf(maxs, NUM_OF_K), Arrays.copyOf(array, ARRAY_SIZE));
        long stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime) + " ns");

        // Better algorithm
        System.out.println("\n-------- Better implementation --------");
        startTime = System.nanoTime();
        betterImplementation(Arrays.copyOf(maxs, NUM_OF_K), Arrays.copyOf(array, ARRAY_SIZE));
        stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime) + " ns");

    }

    /**
     * Algorithm:
     * 1. Go through the array and look for the maximum
     * For example:
     * array = { 8, 15, 25, 1, 3, 6, 9, 8}
     * maxValue = 25
     * positionOfMax = 2;
     * 2. If maxs doesn`t contain current j - index of max, write j to maxs
     * <p>
     * Complexity:
     * - external cycle:               k (iterations)
     * - internal cycle:               n (iterations)
     * - check index of max in maxs:   k (iterations)
     * So: O(k*n*k) = O(n*k^2)
     */
    public static void naiveImplementation(int[] maxs, int[] array) {
        int max = 0;
        boolean contain = false;

        for (int i = 0; i < NUM_OF_K; i++) {
            max = Integer.MIN_VALUE;
            for (int j = 0; j < ARRAY_SIZE; j++) {
                contain = false;
                for (int k = 0; k < i; k++) {
                    if (maxs[k] == j) {
                        contain = true;
                    }
                }
                if (contain == false) {
                    if (max < array[j]) {
                        max = array[j];
                        maxs[i] = j;
                    }
                }
            }
        }
        System.out.print("Max elements: ");
        for (int i = 0; i < NUM_OF_K; i++) {
            System.out.print(array[maxs[i]] + " ");
        }
        System.out.println();
    }

    /**
     * Algorithm:
     * 1. Go through the array and write to maxs first k elements from array
     * For example:
     * array = { 8, 15, 25, 1, 3, 6, 9, 8}
     * maxs = {8, 15, 25 , 1} when k = 4
     * 2. Looking for in maxs min value
     * min = 1
     * 3. If the following (after the k-position) elements have a value greater than the min, change the min to an element with a large value
     * maxs = {8, 15, 25 , 1}
     * min = 1
     * nextValue = 3 => 3 > 1 => maxs = {8, 15, 25 , 3}
     *
     * Repeat 3. while the array runs out
     *
     * Complexity:
     * - external cycle:               n (iterations)
     * - internal cycle:               k (iterations)
     *
     * So: O(n*k)
     */
    public static void betterImplementation(int[] maxs, int[] array) {
        int counterMax = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if(counterMax < NUM_OF_K){
                maxs[counterMax++] = array[i];
            } else {
                int min = 0;
                for (int j = 0; j < NUM_OF_K; j++) {
                    if (maxs[j] < maxs[min]) {
                        min = j;
                    }
                }
                if (array[i] > maxs[min]){
                    maxs[min] = array[i];
                }
            }
        }
        System.out.print("Max elements: ");
        for (int i = 0; i < NUM_OF_K; i++) {
            System.out.print(maxs[i] + " ");
        }
        System.out.println();
    }

    private static void fillArray(int[] array) {
        Random r = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = r.nextInt(35);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
