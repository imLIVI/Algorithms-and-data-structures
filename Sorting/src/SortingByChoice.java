public class SortingByChoice {
    /**
     * Program invariant: the numbers that left of count - sorted
     *
     * Program complexity:
     * 1-st iteration: n comparisons
     * 2-nd iteration: (n-1) comparisons
     * ...
     * n-1 iteration: 0 comparison
     * So: n + (n-1) + (n-2) + ... + 0 ~ n*(n - 1)/2 ~ n^2/2 ~ O(n^2)
     *
     * */
    public static int[] sortingByChoice(int[] array) {
        long startTime = System.nanoTime();

        int min;
        int positionMin = 0;
        int count = 0;

        while (count != array.length - 1) {
            min = Integer.MAX_VALUE;

            // 1. Looking for min value in array and save position of min value
            for (int i = count; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                    positionMin = i;
                }
            }

            // 2. Shift elements of array
            for (int j = positionMin; j > count; j--) {
                array[j] = array[j - 1];
            }

            // 3. Writing min value to the left
            array[count] = min;

            // 4. Adding a counter of sorted items
            count++;

        }
        long stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime) + " ns");

        return array;
    }
}
