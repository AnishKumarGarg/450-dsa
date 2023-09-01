public class minmax2 {
    static void maximum(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i : arr) {
            if (i>max) {
                max=i;
            }
        }
        System.out.println("Maximum Elememt is: "+max);
    }
    static void minimum(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int i : arr) {
            if (i<min) {
                min=i;
            }
        }
        System.out.println("Minimum Element is: "+min);
    }
    public static void main(String[] args) {
        int[] arr={6,2,1,8,7};
        minimum(arr);
        maximum(arr);
    }
}
