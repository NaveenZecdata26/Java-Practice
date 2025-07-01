package Dsa;

import java.util.Arrays;

public class MergerSort {
    public static void main(String[] args) {
        int arr[] = {45, 23, 56, 78, 21, 11, 67};
        divide(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    static void divide(int[] arr, int length) {
        if (length < 2) return;
        int m = length / 2;
        int n = length - m;
        int[] a = new int[m];
        int[] b = new int[n];
        System.arraycopy(arr, 0, a, 0, m);
        System.arraycopy(arr, m, b, 0, n);
        divide(a, m);
        divide(b, n);
        merge(a, b, m, n, arr);
    }

    private static void merge(int[] a, int[] b, int m, int n, int[] arr) {
        for (int i = 0, j = 0, k = 0; k < m + n; ) {
            if (i >= m) {
                arr[k++] = b[j++];
            } else if (j >= n) {
                arr[k++] = a[i++];
            } else if (a[i] < b[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }
    }
}
