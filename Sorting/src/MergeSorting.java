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
    public static int middle;
    public static int[] left;
    public static int[] right;
    public static int temp;
    public static int count = 0;

    public static int[] mergeSorting(int[] array) {
        //long startTime = System.nanoTime();

        // Basic case
        if (array.length == 1) {
            return array;
        }

        // Looking for a middle of array
        middle = (int)Math.round((double) array.length/2);

        // Divide array on two arrays
        left = new int[middle];
        right = new int[array.length - middle];

        // Filling arrays
        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        for (int j = middle; j < array.length; j++) {
            right[j - middle] = array[j];
        }

        // Recursion
        int[] left_sorted = mergeSorting(left);
        int[] right_sorted = mergeSorting(right);

        return merge(left_sorted, right_sorted);
    }

    public static int[] merge(int[] left, int[] right) {
        int mergeArrSize = left.length + right.length;
        int[] mergeArr = new int[mergeArrSize];
        int l = 0, r = 0, m = 0;

        while (l < left.length || r < right.length) {
            if (l == left.length) {
                mergeArr[m] = right[r];
                r++;
            } else if (r == right.length) {
                mergeArr[m] = left[l];
                l++;
            } else {
                if (left[l] <= right[r]) {
                    mergeArr[m] = left[l];
                    l++;
                } else {
                    mergeArr[m] = right[r];
                    r++;
                    m++;
                }
            }
        }

        return mergeArr;
    }
}
