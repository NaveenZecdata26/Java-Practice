package Dsa;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13, 7, 45, 33, 14, 18};
        selectionSort(arr, arr.length - 1);
    }

    private static void selectionSort(int[] arr, int n) {

        for (int i = 0; i <= n; i++) {
            int min = i;
            for (int j = i + 1; j <= n; j++) {
                {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                if (i != min) {
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
