// find Largest sum contiguous Subarray [V. IMP]

public class Sum_contiguous_array {
    static int max_sum(int[] arr) {
        int sum=0;
        int maxEndingHere = arr[0];
        // int maxSoFar = arr[0];
    
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            maxEndingHere = Math.max(sum, maxEndingHere);
            // maxSoFar = Math.max(maxSoFar, maxEndingHere);
            if (sum<0) {
                sum=0;
            }
        }
    
        return maxEndingHere;
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,7,-4,3,2,-10,9,1};
        System.out.println(max_sum(arr));
    }
}


// Kadane's algo