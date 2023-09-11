import java.util.Arrays;

public class MergeArrays {
    static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] combinedArray = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            combinedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinedArray[arr1.length + i] = arr2[i];
        }

        Arrays.sort(combinedArray);

        System.out.println(Arrays.toString(combinedArray));

    }

    public static void main(String[] args) {
        int[] arr1={1 ,3 ,5 ,7};
        int[] arr2={0 ,2 ,6 ,8 ,9};
        System.out.println("Merged Array:");
        merge(arr1, arr2);
    }
}
