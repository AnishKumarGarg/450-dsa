import java.util.Arrays;

public class Minimize_Heights_wrong {
    static int getMinDiff(int arr[], int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int result = arr[n - 1] - arr[0]; // Initialize result with the current height difference

        // Loop through the array to consider two cases: adjusting the shortest and tallest towers
        for (int i = 1; i < n; i++) {
            int minHeight = Math.min(arr[0] + k, arr[i] - k);
            int maxHeight = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            result = Math.min(result, maxHeight - minHeight);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k = 5;
        System.out.println(getMinDiff(arr, k));
    }
}
