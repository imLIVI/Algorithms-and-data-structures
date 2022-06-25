public class SortingByInsertion {
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
    public static int[] sortingByInsertion(int[] array) {
        long startTime = System.nanoTime();

        int temp = 0;
        int posSorted = 0;

        while (posSorted != array.length - 1) {
            posSorted++;
            for (int i = posSorted; i < 0; i--) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
        long stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime) + " ns");

        return array;
    }
}
