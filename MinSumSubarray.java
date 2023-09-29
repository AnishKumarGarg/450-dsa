// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.


// SLIDING WINDOW APPROACH
public class MinSumSubarray {
    static int minSubArrayLen(int target, int[] arr) {
        int left = 0;   // Left pointer
        int sum = 0;    // Current Sum
        int minLen = Integer.MAX_VALUE;  // Take MAX_VALUE to compare and find the minimum
        for (int right = 0; right < arr.length; right++) {    
            sum += arr[right];       // increment sum by arr[right]
            while (sum >= target) {   // Till sum is greater or equal to the target 
            // While not if because we want to continue doing this till sum>=target. If we used if, this would be done only once
                minLen = Math.min(minLen, right - left + 1);    // replace minLen by that window size(right-left+1)
                sum -= arr[left];      // Substract one element to the left from sum
                left++;                // Increment left
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minLen;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2,3,1,2,4,3 };
        int target = 7;
        System.out.println(minSubArrayLen(target, arr));
    }
}

// https://youtu.be/aYqYMIqZx5s
