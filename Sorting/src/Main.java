import java.util.Random;

public class Main {
    public static final int ARRAY_SIZE = 10;
    public static int[] array = new int[ARRAY_SIZE];

    public static void main(String[] args) {

        // Filling an array with random numbers
        System.out.println("Array before sorting: ");
        fillArray();

        // Bubble sort
        System.out.println("\n---Bubble sorting---");
        printArray(BubbleSort.bubbleSort(array));

        // Sorting by choice
        System.out.println("\n---Sorting by choice---");
        printArray(SortingByChoice.sortingByChoice(array));

        // Sorting by insertion
        System.out.println("\n---Sorting by insertion---");
        printArray(SortingByInsertion.sortingByInsertion(array));

    }

    public static void fillArray() {
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
