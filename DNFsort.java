// Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

import java.util.Arrays;

public class DNFsort {
    static void sort(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 0, 0, 1, 2, 2, 1, 0 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
