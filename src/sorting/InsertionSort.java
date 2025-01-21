package sorting;

import java.util.Arrays;

public class InsertionSort {
    public void insertionSort(int[] arr) {
//        new int[]{10, 4, 6, 2, 7, 3, 4, 1, 8}
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }


        System.out.println(Arrays.toString(arr));
    }
}
