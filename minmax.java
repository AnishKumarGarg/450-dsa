// Find the maximum and minimum element in an array

public class minmax {
    static void minimum(int arr[]){
        int min=arr[0];
        for (int i : arr) {
            if (i<min) {
                min=i;
            }
        }
        System.out.println("Minimum Element: "+ min);
    }

    static void maximum(int arr[]){
        int max=arr[0];
        for (int i : arr) {
            if(i>max){
                max=i;
            }
        }
        System.out.println("Maximum Element: "+max );
    }

    public static void main(String[] args) {
        int[] arr={6,2,1,8,7};
        minimum(arr);
        maximum(arr);
    }
}
