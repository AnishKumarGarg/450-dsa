public class TrappingRainwater {
    static int TrappingRainwater(int[] arr){
        int left=0;
        int right=arr.length-1;
        int leftmax=0; // Max height on the left
        int rigthmax=0; // Max height on the right
        int res=0;  // Total water present
        while (left<=right) {
            if (arr[left]<=arr[right]) {
                if (arr[left]>=leftmax) {
                    leftmax=arr[left];    // Updating max height on the left
                }
                else{ 
                    res+=(leftmax-arr[left]);    // if arr[left] already max, increase result by leftmax-current height
                }
                left++;
            }
            else{
                if (arr[right]>=rigthmax) {
                    rigthmax=arr[right];   //  Updating max height on the right
                }
                else{
                    res+=(rigthmax-arr[right]);  // if arr[right] already max, increase result by rightmax-current height
                }
                right--;
            }
            
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TrappingRainwater(arr));
    }
}

// Ammount of water stored=min(max(height of buildings on left and right))-height of current building
// res = min(leftmax and rightmax)-(a[l] and a[r])
