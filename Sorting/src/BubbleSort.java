import java.util.Arrays;

public class BubbleSort extends Sorting{
    /**
     * Program invariant: the array after "merge" (function) - sorted
     *
     * Program complexity:
     *                                       ---- SIZE OF ARRAY after each recursion call ----
     * 1-st level of recursion:                        (0...n)                                   sum = n
     *                                              /            \
     * 2-nd level of recursion:            (0...n/2)              (n/2...n)                      sum = n
     *                                      /    \               /          \
     * 3-nd level of recursion:    (0...n/4)    (n/4...n/2)  (n/2...3n/4)    (3n/4...n)          sum = n
     * ...
     * On each level the complexity is const = O(n)
     *
     * Number of levels = log2(n)
     *
     * => So program complexity = O (n*log2(n))
     *
     * But using memory = O(n) (for function "merge")
     * */
    private int[] array;
    private int arraySize;

    BubbleSort(int[] arr){
        this.arraySize = arr.length;
        this.array = Arrays.copyOf(arr, arraySize);
    }

    @Override
    public void sort() {
        long startTime = System.nanoTime();

        int temp = 0;
        int count = 0;

        while(count!=array.length-1){
            for (int i = 0; i < array.length - 1 - count; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            count++;
        }
        long stopTime = System.nanoTime();

        printInformation(array, stopTime - startTime);
    }
}
