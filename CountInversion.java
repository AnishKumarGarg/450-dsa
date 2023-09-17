// For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
// If an array is sorted in the reverse order then the inversion count is the maximum. 
// Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

public class CountInversion {
    static int count_inversion(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j] && i<j) {
                    count++;
                }
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={2, 4, 1, 3, 5};
        System.out.println(count_inversion(arr));
    }
}
