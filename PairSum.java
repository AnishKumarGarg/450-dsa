// Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

public class PairSum {
    static int getPairsSum(int[] arr,int k){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]+arr[i]==k) {
                    count++;
                }
            }
        }
        return count;
    }
     public static void main(String[] args) {
        int arr[]={1,5,7,1};
        int k=6;
        System.out.println(getPairsSum(arr, k));
    }
}
