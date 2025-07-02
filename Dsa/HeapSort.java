package Dsa;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13, 7, 45, 33, 14, 18};
        heapSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr, int n) {

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = n - 1; i >= 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int root = i;

        if (left < n && arr[left] > arr[root]) {
            root = left;
        }
        if (right < n && arr[right] > arr[root]) {

            root = right;

        }

        if (root != i) {
            int temp = arr[root];
            arr[root] = arr[i];
            arr[i] = temp;
            heapify(arr, n, root);
        }
    }


}
