public class duplicate_number {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 5};
        
        int n = array.length;

        for (int i = 0; i < n; i++) {
            // Check the sign of the element at the current index
            int index = Math.abs(array[i]) - 1;
            
            // If the element at index is positive, make it negative
            if (array[index] > 0) {
                array[index] = -array[index];
            } else {
                // If it's already negative, it's a duplicate
                System.out.println("Duplicate element: " + Math.abs(array[i]));
            }
        }
    }
}
