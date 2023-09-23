// Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

import java.util.Arrays;

public class LongestSubsequence {
    static int findLongestConseqSubseq(int arr[]) {
        
        int count = 1; // Initialize count to 1 for the first element itself
        int longest = 1; // Initialize the longest subsequence length to 1
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i] + 1) {
                count++;
            } else if (arr[i + 1] != arr[i]) {
                // If the current element is not equal to the next one, reset count
                count = 1;
            }

            // Update longest if needed
            if (count > longest) {
                longest = count;
            } 
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = { 0,1,1,2,4 };
        System.out.println(findLongestConseqSubseq(arr));
    }
}
