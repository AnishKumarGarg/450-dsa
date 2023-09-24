public class Triplet {
    static boolean isTriplet(int[] arr, int X){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==X) {
                        System.out.println("Triplet is "+arr[i]+"+"+arr[j]+"+"+arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,3,6};
        int X=13;
        System.out.println(isTriplet(arr, X));
    }
}
