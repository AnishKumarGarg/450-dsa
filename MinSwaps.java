// Given an array arr of n positive integers and a number k. One can apply a swap operation on the array any number of times, i.e choose any two index i and j (i < j) and swap arr[i] , arr[j] . Find the minimum number of swaps required to bring all the numbers less than or equal to k together, i.e. make them a contiguous subarray.

public class MinSwaps {
    static int minSwaps(int[] arr, int k, int n) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=k) {
                count++;  // Count all the good elements 
            }
        }

        int bad=0;
        for (int i = 0; i < count; i++) {
            if (arr[i]>k) {
                bad++;  // Count the number of bad elements in the first window (0 to count)
            }
        }

        int start=0;
        int end=count-1;
        int res=Integer.MAX_VALUE;
        while (end<n) {
            res=Math.min(start, res);  // Update res to minimum
            end++;                     // First increment end
            if (end<n && arr[end]>k) {
                bad++;                 // If arr[end] is bad, increment bad; but dont increment start yet, so window size is count+1
            }
            if (start<n && arr[start]>k) {    
                bad--;
                // If arr[start] is bad, decrement bad; to adjust the increment done in previous window on arr[end] if in case it was a bad element
            }
       }

       return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 5, 8, 7, 4} ;
        int n = arr.length;
        int k = 6;
        int swaps = minSwaps(arr, k, n);
        System.out.println("Minimum swaps required: " + swaps);
    }
}

// The code you provided uses a sliding window approach to solve the problem of
// finding the minimum number of swaps required to bring all the numbers less
// than or equal to k together in an array.

// Sliding window approach

// The sliding window approach is a technique for traversing an array or stream
// of data in a sequential way, while maintaining a window of a fixed size. The
// window is moved one element at a time, and the elements in the window are
// processed in some way.

// Logic behind the code

// The code you provided works as follows:

// It first counts the number of elements in the array that are less than or
// equal to k. This is the size of the sliding window.

// It then initializes a variable bad to the number of elements in the first
// window that are greater than k.

// It then iterates over the array, sliding the window one element at a time.
// For each window, it updates bad to reflect the number of elements in the
// window that are greater than k.

// It also keeps track of the minimum number of swaps required, which is the
// minimum value of bad for any window.

// At the end of the iteration, it returns the minimum number of swaps required.
