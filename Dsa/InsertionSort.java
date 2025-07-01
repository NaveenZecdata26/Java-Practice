package Dsa;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13, 7, 45, 33, 14, 18};

        insertionSort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            int value = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > value; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = value;
        }

    }
}
