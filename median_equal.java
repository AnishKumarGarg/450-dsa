// Median of two sorted arrays of same size

import java.util.Arrays;

public class median_equal {
    static void findMedian(int[] arr1, int[] arr2, int N1, int N2) {
        int N3 = N1 + N2;
        int[] mergedArray = new int[N3];
        for (int i = 0; i < N1; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int i = 0; i < N2; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }
        double median = 0;
        Arrays.sort(mergedArray);
        for (int i = 0; i < N3; i++) {
            median = (double)(mergedArray[(N3 - 1) / 2] + mergedArray[N3 / 2]) / 2;
        }
        System.out.println(median);
    }

    public static void main(String[] args) {
        int[] arr1={ 1, 4, 5, 6, 10 };
        int N1=arr1.length;
        int[] arr2={ 2, 3, 4, 5, 7 };
        int N2=arr2.length;
        findMedian(arr1, arr2, N1, N2);
        
    }
}
