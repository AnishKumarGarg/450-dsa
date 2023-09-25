// Median of 2 sorted arrays of different size

import java.util.Arrays;

public class Median {
    static double median(int[] a, int[] b, int n1, int n2) {
        int n3 = n1 + n2;
        int[] mergedArray = new int[n3];
        for (int i = 0; i < n1; i++) {
            mergedArray[i] = a[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedArray[n1 + i] = b[i];
        }
        Arrays.sort(mergedArray);
        double median = 0;

        if (n3 % 2 != 0) {
            median = (double) mergedArray[n3 / 2];
        } else {
            int mid1 = mergedArray[n3 / 2 - 1];
            int mid2 = mergedArray[n3 / 2];
            median = (double) (mid1 + mid2) / 2.0;
        }

        return median;
    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 6 };
        int n1 = a.length;
        int[] b = { 1, 3, 5 };
        int n2 = b.length;
        System.out.println(median(a, b, n1, n2));
    }
}
