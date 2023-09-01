// Find the "Kth" max and min element of an array
import java.util.*;

public class Kth_smallest {
    static int Kth_min(ArrayList<Integer> arr, int K) {
        Collections.sort(arr);
        return arr.get(K - 1);
    }
    static int Kth_max(ArrayList<Integer> arr, int K) {
        Collections.sort(arr);
        Collections.reverse(arr);
        return arr.get(K-1);   
       
    }

    public static void main(String[] args) {
        int K = 3;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(7);
        arr.add(10);
        arr.add(4);
        arr.add(3);
        arr.add(20);
        arr.add(15);
        System.out.println(Kth_min(arr, K));
        System.out.println(Kth_max(arr, K));

    }
}
