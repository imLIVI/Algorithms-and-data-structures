import java.util.Arrays;

public class MergeSorting {
    /**
     * Program invariant: the numbers before [posSorted] - sorted
     * <p>
     * Program complexity:
     * 1-st iteration: 1 comparisons
     * 2-nd iteration: 2 comparisons
     * ...
     * n-1 iteration: (n-1) comparison
     * So: 1 + 2 + ... + n-1 ~ n*(n - 1)/2 ~ n^2/2 ~ O(n^2)
     */
    public static void mergeSorting(int[] array, int len) {

        // Basic case
        if (len < 2) {
            return ;
        }

        // Looking for a middle of array
        int middle = len/2;

        // Divide array on two arrays
        int[] left = new int[middle];
        int[] right = new int[len - middle];

        // Filling arrays
        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        for (int j = middle; j < len; j++) {
            right[j - middle] = array[j];
        }

        // Recursion
        mergeSorting(left, middle);
        mergeSorting(right, len - middle);

        /**
         * The most difficult operation
         *
         * */
        merge(array, left, right, middle, len - middle);
    }

    public static void merge(int[] array, int[] left, int[] right, int lenL, int lenR) {
        int l = 0, r = 0, m = 0;

        while (l < lenL && r < lenR) {
            if (left[l] <= right[r])
                array[m++] = left[l++];
            else
                array[m++] = right[r++];
        }

        while (l < lenL)
            array[m++] = left[l++];

        while (r < lenR)
            array[m++] = right[r++];

    }
}
