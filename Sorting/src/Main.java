import java.util.Arrays;
import java.util.Random;

public class Main {
    public static final int ARRAY_SIZE = 100;

    public static void main(String[] args) {

        int[] array = new int[ARRAY_SIZE];

        // Filling an array with random numbers
        System.out.println("Array before sorting: ");
        fillArray(array);

        // Bubble sort
        System.out.println("\n---Bubble sorting---");
        Sorting bubbleSort = new BubbleSort(array);
        bubbleSort.sort();
        //printArray(BubbleSort.bubbleSort(array));

        // Sorting by choice
        System.out.println("\n---Sorting by choice---");
        Sorting sortingByChoice = new SortingByChoice(array);
        sortingByChoice.sort();

        // Sorting by insertion
        /**
         * TODO: Modify because this algorithms works incorrect*/
        System.out.println("\n---Sorting by insertion---");
        Sorting sortingByInsertion = new SortingByInsertion(array);
        sortingByInsertion.sort();

        // Quick sort
        /**
         * TODO: Define complexity and invariant*/
        System.out.println("\n---Quick sort---");
        int[] arr = Arrays.copyOf(array, ARRAY_SIZE);
        //int[] arr = {8,2,9,4,7,6,1,5,3};
        long startTime = System.nanoTime();
        QuickSort.quickSort(arr, 0, ARRAY_SIZE - 1);
        long stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime) + " ns");
        printArray(arr);

        // Sorting by merge
        System.out.println("\n---Sorting by merge---");
        arr = Arrays.copyOf(array, ARRAY_SIZE);
        startTime = System.nanoTime();
        MergeSorting.mergeSorting(arr, ARRAY_SIZE);
        stopTime = System.nanoTime();
        System.out.println("Time: " + (stopTime - startTime) + " ns");
        printArray(arr);


    }

    private static void fillArray(int[] array) {
        Random r = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = r.nextInt(35);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] array){
        System.out.println("Array after sorting: ");
        for (int j = 0; j < ARRAY_SIZE; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

}
