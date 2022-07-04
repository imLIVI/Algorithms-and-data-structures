import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    /**
     * Program invariant: arr[pivot] - sorted
     *
     * Program complexity:
     * ---- SIZE OF ARRAY after each recursion call ----
     * 1-st level of recursion:                        (0...n)                                   sum = n
     * /            \
     * 2-nd level of recursion:            (0...n/2)              (n/2...n)                      sum = n
     * /    \               /          \
     * 3-nd level of recursion:    (0...n/4)    (n/4...n/2)  (n/2...3n/4)    (3n/4...n)          sum = n
     * ...
     * On each level the complexity is const = O(n)
     *
     * Number of levels = log2(n)
     *
     * => So program complexity = O (n*log2(n))
     *
     * And we don`t use additional memory (as mergeSort for function "merge")
     */

    public static void quickSort(int arr[], int lo, int hi) {
        if (lo < hi) {
            int pivot = pivoting(arr, lo, hi);

            quickSort(arr, lo, pivot - 1);
            quickSort(arr, pivot + 1, hi);
        }
    }

    public static int pivoting(int[] arr, int lo, int hi) {
        int pivot = hi;
        while (lo < hi) {
            while (arr[lo] <= arr[pivot] && lo < hi) {
                lo++;
            }
            while (arr[hi] >= arr[pivot] && lo < hi) {
                hi--;
            }
            if (lo < hi) {
                swap(arr, lo, hi);
            }
            if (lo == hi) {
                swap(arr, lo, pivot);
            }
        }
        return lo;
    }

    public static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
