package Dsa;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13, 7, 45, 33, 14, 18};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr)
        );
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int p = helper(arr, start, end);
            quickSort(arr, start, p - 1);
            quickSort(arr, p + 1, end);
        }

    }

    private static int helper(int[] arr, int i, int end) {
        int start = i;
        int position = i;
        int pivot = arr[end];
        for (int j = start; j < arr.length; j++) {

            if (arr[j] < pivot) {
                int temp = arr[j];
                arr[j] = arr[position];
                arr[position] = temp;
                position++;
            }
        }
        int temp = arr[end];
        arr[end] = arr[position];
        arr[position] = temp;
        return position;
    }

}
