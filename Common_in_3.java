// Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.

public class Common_in_3 {
    static void CommonElements(int[] arr1,int[] arr2,int[] arr3){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    if (arr1[i]==arr2[j] &&  arr2[j]==arr3[k]) {
                        System.out.print(arr1[i]+" ");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1={1, 5, 10, 20, 40, 80};
        int[] arr2={6, 7, 20, 80, 100};
        int[] arr3={3, 4, 15, 20, 30, 70, 80, 120};
        CommonElements(arr1, arr2, arr3);
    }
}
