
public class Subarray_with_0_sum {
    static boolean findsum(int[] arr){
        
        for (int i = 0; i < arr.length; i++) {
            int sum=0;  // Reset sum to 0
            for (int j = i; j < arr.length; j++) {
                sum=sum+arr[j];    
                if (sum==0) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={4 ,2 ,-3 ,1 ,6};
        System.out.println(findsum(arr));
    }
}
