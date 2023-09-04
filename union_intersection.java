import java.util.Arrays;

public class union_intersection {
    static void intersection(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr2[j] + " ");
                }
            }
        }
    }

    static int[] union(int[] arr1, int[] arr2) {
        int[] combinedArr = new int[arr1.length + arr2.length];

        // Copy elements from arr1 into combinedArr
        for (int i = 0; i < arr1.length; i++) {
            combinedArr[i] = arr1[i];
        }

        // Copy elements from arr2 into combinedArr, starting where arr1 ends
        int currentIndex = arr1.length;
  
        for (int i = 0; i < arr2.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < currentIndex; j++) {
                if (arr2[i] == combinedArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                combinedArr[currentIndex] = arr2[i];
                currentIndex++;
            }
        }

        // Create a new array with the correct size (removing extra unused elements)
        int[] result = Arrays.copyOf(combinedArr, currentIndex);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };
        System.out.print("Intersection: ");
        intersection(arr1, arr2);
        System.out.println();
        System.out.print("Union: ");
        int[] unionResult = union(arr1, arr2);
        System.out.println(Arrays.toString(unionResult));
    }
}
