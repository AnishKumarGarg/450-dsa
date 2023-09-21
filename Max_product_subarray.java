public class Max_product_subarray {
    public static long maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        long maxProduct = nums[0];
        long minProduct = nums[0];
        long result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                long temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max((long) nums[i], maxProduct * nums[i]);
            minProduct = Math.min((long) nums[i], minProduct * nums[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 12, 15, 23, 33, -35, 30, -40, -30, -30, -30, 26, 28};
        System.out.println(maxProduct(arr));
    }
}
