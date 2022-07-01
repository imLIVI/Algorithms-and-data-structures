import java.util.Arrays;

public class BubbleSort extends Sorting{
    /**
     * Program invariant: the numbers that right of [array.length - 1 - count] - sorted
     *
     * Program complexity:
     * 1-st iteration: (n-1) comparisons
     * 2-nd iteration: (n-2) comparisons
     * ...
     * n-1 iteration: 1 comparison
     * So: (n-1) + (n-2) + ... + 1 ~ n*(n - 1)/2 ~ n^2/2 ~ O(n^2)
     *
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
