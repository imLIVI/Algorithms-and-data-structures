public abstract class Sorting {

    public void printInformation(int[] array, double timeDiff){
        // Print the running time of the sorting algorithm
        System.out.println("Time: " + timeDiff + " ns");

        // Print the array after sorting
        System.out.println("Array after sorting: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

    public abstract void sort();
}
