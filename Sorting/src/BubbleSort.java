public class BubbleSort {
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
    public static int[] bubbleSort(int[] array) {
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
        System.out.println("Time: " + (stopTime - startTime) + " ns");

        return array;
    }

}
