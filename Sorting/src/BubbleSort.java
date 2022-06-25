public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
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
        return array;
    }

}
