import java.util.Random;

public class Main {
    public static final int ARRAY_SIZE = 10;
    public static int[] array = new int[ARRAY_SIZE];

    public static void main(String[] args) {

        // Filling an array with random numbers
        fillArray();

        // Print the array
        System.out.println("Array before sorting: ");
        printArray();

        // Bubble sort
        array = BubbleSort.bubbleSort(array);
        System.out.println("\nArray after bubble sorting: ");
        printArray();
    }

    public static void fillArray() {
        Random r = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = r.nextInt(35);
        }
    }

    public static void printArray(){
        for (int j = 0; j < ARRAY_SIZE; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

}
