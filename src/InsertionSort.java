import java.util.Arrays;

public class InsertionSort {
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (true) {
                if (j < 0 || temp >= array[j]) {
                    array[j + 1] = temp;
                    break;
                }

                array[j + 1] = array[j];
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {17, 16, 5, 14, 13, 12, 11, 15, 4, 3};

        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
